package com.zhangshi.multiblog.mapper;

import com.zhangshi.multiblog.entity.PermissionParentMenuKey;

public interface PermissionParentMenuMapper {
    int deleteByPrimaryKey(PermissionParentMenuKey key);

    int insert(PermissionParentMenuKey record);

    int insertSelective(PermissionParentMenuKey record);
}