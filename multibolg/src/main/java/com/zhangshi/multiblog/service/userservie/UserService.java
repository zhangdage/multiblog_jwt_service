package com.zhangshi.multiblog.service.userservie;

import com.zhangshi.multiblog.entity.Role;
import com.zhangshi.multiblog.entity.User;

public interface UserService {
    public User getUserByName(String user_name);

    public Role getRoleByUserId(Integer user_id);
}
