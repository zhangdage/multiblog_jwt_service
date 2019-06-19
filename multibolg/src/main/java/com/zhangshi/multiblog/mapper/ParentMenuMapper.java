package com.zhangshi.multiblog.mapper;

import com.zhangshi.multiblog.entity.ParentMenu;

public interface ParentMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ParentMenu record);

    int insertSelective(ParentMenu record);

    ParentMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ParentMenu record);

    int updateByPrimaryKey(ParentMenu record);
}