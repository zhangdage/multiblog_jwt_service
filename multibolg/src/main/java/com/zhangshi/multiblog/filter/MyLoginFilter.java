package com.zhangshi.multiblog.filter;

import com.zhangshi.multiblog.common.domain.MyUserDetails;
import com.zhangshi.multiblog.common.domain.RespBean;
import com.zhangshi.multiblog.common.util.GetPostRequestContentUtil;
import com.zhangshi.multiblog.common.util.JwtUtil;
import com.zhangshi.multiblog.common.util.ObjectMapperUtil;
import com.zhangshi.multiblog.entity.ParentMenu;
import com.zhangshi.multiblog.entity.Permission;
import com.zhangshi.multiblog.entity.User;
import com.zhangshi.multiblog.mapper.PermissionMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Slf4j
public class MyLoginFilter extends UsernamePasswordAuthenticationFilter{

    private AuthenticationManager authenticationManager;

    private String head;

    private String tokenHeader;

    private PermissionMapper permissionMapper;

    public MyLoginFilter(AuthenticationManager authenticationManager,String head,String tokenHeader,PermissionMapper permissionMapper) {
        this.authenticationManager = authenticationManager;
        this.head = head;
        this.tokenHeader = tokenHeader;
        this.permissionMapper = permissionMapper;
    }


    /**
     * 接收并解析用户登陆信息  /login,必须使用/login，和post方法才会进入此filter
     *如果身份验证过程失败，就抛出一个AuthenticationException
     * @param request
     * @param response
     * @return
     * @throws AuthenticationException
     */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        //从request中获取username和password，并封装成user
        String body =  new GetPostRequestContentUtil().getRequestBody(request);
        User user = (User) ObjectMapperUtil.readValue(body,User.class);
        if (user == null){
            log.error("解析出错");
            return null;
        }
        String userName = user.getUserName();
        String password = user.getPassword();
        log.info("用户(登录名)：{} 正在进行登录验证。。。密码：{}",userName,password);
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userName,password);
        //提交给自定义的provider组件进行身份验证和授权
        Authentication authentication = authenticationManager.authenticate(token);
        return authentication;
    }

    /**
     * 验证成功后,此方法会被调用,在此方法中生成token,并返回给客户端
     * @param request
     * @param response
     * @param chain
     * @param authResult
     * @throws IOException
     * @throws ServletException
     */
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        //设置安全上下文。在当前的线程中，任何一处都可以通过SecurityContextHolder来获取当前用户认证成功的Authentication对象
        SecurityContextHolder.getContext().setAuthentication(authResult);
        MyUserDetails userDetails = (MyUserDetails) authResult.getPrincipal();
        //使用JWT快速生成token
        String token = JwtUtil.setClaim(userDetails.getUsername(),true,60*60*1000);
        //根据当前用户的权限可以获取当前用户可以查看的父菜单以及子菜单。(这里在UserDetailsService中由于级联查询，该用户下的所有信息已经查出)
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        List<ParentMenu> parentMenus = new ArrayList<>();
        for (GrantedAuthority authority : authorities){
            String permissionName = authority.getAuthority();
            Permission permission = permissionMapper.getPermissionByPermissionName(permissionName);
            List<ParentMenu> parentMenuList = permission.getParentMenus();
            for (ParentMenu parentMenu : parentMenuList){
                if (!parentMenus.contains(parentMenu)){
                    parentMenus.add(parentMenu);
                }
            }
        }
        //返回在response header 中返回token，并且返回用户可以查看的菜单数据
        response.setHeader(tokenHeader,head+token);
        response.setCharacterEncoding("utf-8");

        response.getWriter().write(ObjectMapperUtil.writeAsString(RespBean.ok("登录成功!", userDetails.returnSecureUser())));
    }
}
