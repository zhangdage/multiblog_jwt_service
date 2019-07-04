package com.zhangshi.multiblog.service.userservie.impl;

import com.zhangshi.multiblog.common.domain.MyUserDetails;
import com.zhangshi.multiblog.entity.Permission;
import com.zhangshi.multiblog.entity.Role;
import com.zhangshi.multiblog.entity.User;
import com.zhangshi.multiblog.exception.FriendlyWrongException;
import com.zhangshi.multiblog.mapper.ParentMenuMapper;
import com.zhangshi.multiblog.mapper.RoleMapper;
import com.zhangshi.multiblog.mapper.UserMapper;
import com.zhangshi.multiblog.service.userservie.UserService;
import com.zhangshi.multiblog.service.userservie.outputdto.RouterList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl
        implements UserService
{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private ParentMenuMapper parentMenuMapper;

    public User getUserByName(String user_name)
    {
        return this.userMapper.getUser(user_name);
    }

    public Role getRoleByUserId(Integer user_id)
    {
        return this.roleMapper.getRolesByUserId(user_id);
    }

    public List<RouterList> getRouterList()
    {
        List<Integer> permissionIds = new ArrayList();
        MyUserDetails myUserDetails = (MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (myUserDetails == null) {
            throw new FriendlyWrongException("你还没有登录，不能获取路由表");
        }
        List<Role> roles = myUserDetails.getRoles();
        for (Role role : roles)
        {
            List<Permission> permissionList = role.getPermissions();
            if ((permissionList != null) || (permissionList.size() != 0)) {
                for (Permission permission : permissionList) {
                    if (!permissionIds.contains(permission.getId())) {
                        permissionIds.add(permission.getId());
                    }
                }
            }
        }
        return this.parentMenuMapper.getRouterListByPermissionIds(permissionIds);
    }
}