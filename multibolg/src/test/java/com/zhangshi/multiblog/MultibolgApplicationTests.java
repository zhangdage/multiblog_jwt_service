package com.zhangshi.multiblog;

import com.zhangshi.multiblog.controller.user.UserController;
import com.zhangshi.multiblog.entity.Permission;
import com.zhangshi.multiblog.entity.Role;
import com.zhangshi.multiblog.entity.User;
import com.zhangshi.multiblog.mapper.PermissionMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultibolgApplicationTests {

    @Autowired
    private UserController userController;
    @Autowired
    private PermissionMapper permissionMapper;

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }


    @Test
    public void contextLoads() {
        System.out.println("跑进方法了");
        User user =  userController.getUser("张大哥");
        System.out.println(user);
        Role role =  userController.getRole(1);
        System.out.println(role);
        Permission permission = permissionMapper.getPermissionByPermissionName("user");
        System.out.println(permission);
        System.out.println("跑出方法了");
    }

}
