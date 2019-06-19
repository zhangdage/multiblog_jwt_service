package com.zhangshi.multiblog.mapper;

import com.zhangshi.multiblog.entity.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    Permission getPermissionByPermissionName(String permission_name);
}