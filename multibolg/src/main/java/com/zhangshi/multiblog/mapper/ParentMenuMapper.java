package com.zhangshi.multiblog.mapper;

import com.zhangshi.multiblog.entity.ParentMenu;
import com.zhangshi.multiblog.service.userservie.outputdto.RouterList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface ParentMenuMapper
{
    public abstract int deleteByPrimaryKey(Integer paramInteger);

    public abstract int insert(ParentMenu paramParentMenu);

    public abstract int insertSelective(ParentMenu paramParentMenu);

    public abstract ParentMenu selectByPrimaryKey(Integer paramInteger);

    public abstract int updateByPrimaryKeySelective(ParentMenu paramParentMenu);

    public abstract int updateByPrimaryKey(ParentMenu paramParentMenu);

    public abstract List<RouterList> getRouterListByPermissionIds(@Param("permissionId") List<Integer> paramList);
}