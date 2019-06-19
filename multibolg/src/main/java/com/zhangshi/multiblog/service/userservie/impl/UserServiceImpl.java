package com.zhangshi.multiblog.service.userservie.impl;

import com.zhangshi.multiblog.entity.Role;
import com.zhangshi.multiblog.entity.User;
import com.zhangshi.multiblog.mapper.RoleMapper;
import com.zhangshi.multiblog.mapper.UserMapper;
import com.zhangshi.multiblog.service.userservie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public User getUserByName(String user_name){
//        return userMapper.getUserByName(user_name);
        return userMapper.getUser(user_name);
//        return new user();
    };

    public Role getRoleByUserId(Integer user_id){
        return  roleMapper.getRolesByUserId(user_id);
    }
}
