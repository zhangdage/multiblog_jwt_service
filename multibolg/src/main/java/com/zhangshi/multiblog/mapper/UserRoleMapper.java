package com.zhangshi.multiblog.mapper;

import com.zhangshi.multiblog.entity.User;
import com.zhangshi.multiblog.entity.UserRoleKey;

public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);

    User getUserByRoleId(Integer role_Id);
}