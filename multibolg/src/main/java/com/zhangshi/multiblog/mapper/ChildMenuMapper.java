package com.zhangshi.multiblog.mapper;

import com.zhangshi.multiblog.entity.ChildMenu;
import com.zhangshi.multiblog.entity.ChildMenuKey;

public interface ChildMenuMapper {
    int deleteByPrimaryKey(ChildMenuKey key);

    int insert(ChildMenu record);

    int insertSelective(ChildMenu record);

    ChildMenu selectByPrimaryKey(ChildMenuKey key);

    int updateByPrimaryKeySelective(ChildMenu record);

    int updateByPrimaryKey(ChildMenu record);
}