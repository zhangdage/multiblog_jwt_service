package com.zhangshi.multiblog.service.myuserdetailservice;


import com.zhangshi.multiblog.common.domain.MyUserDetails;
import com.zhangshi.multiblog.common.util.AuthErrorEnum;
import com.zhangshi.multiblog.entity.Permission;
import com.zhangshi.multiblog.entity.Role;
import com.zhangshi.multiblog.entity.User;
import com.zhangshi.multiblog.exception.WrongUsernameException;
import com.zhangshi.multiblog.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
public class MyUserDetailsService implements UserDetailsService{

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户名登录
     * @param s 用户名
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> userOptional = Optional.ofNullable(userMapper.getUser(s));
        if (userOptional.isPresent()){
            User user = userOptional.get();
            //级联查询
            List<Role> roles = user.getRoles();
            List<Permission> permissions = new ArrayList<>();
            for (Role role:roles){
                //级联查询
                List<Permission> permissionList = role.getPermissions();
//                role.setPermissions(permissionList);
            }
//            user.setRoles(roles);
            UserDetails userDetails = new MyUserDetails(user);
//            List<GrantedAuthority> authorities = (List<GrantedAuthority>) userDetails.getAuthorities();
            return userDetails;
        }else {
            log.error("用户不存在");
            throw new WrongUsernameException( AuthErrorEnum.LOGIN_NAME_ERROR.getMessage());
        }
    }
}
