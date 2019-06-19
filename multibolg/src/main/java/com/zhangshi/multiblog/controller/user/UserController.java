package com.zhangshi.multiblog.controller.user;

import com.zhangshi.multiblog.entity.Role;
import com.zhangshi.multiblog.entity.User;
import com.zhangshi.multiblog.service.userservie.UserService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/detail")
    public User getUser(@PathVariable String user_name){
        return userService.getUserByName(user_name);
    };

    public Role getRole(Integer user_id){
        return userService.getRoleByUserId(user_id);
    }
}
