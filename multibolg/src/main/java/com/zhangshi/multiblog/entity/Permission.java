package com.zhangshi.multiblog.entity;

import java.util.List;

public class Permission {
    private Integer id;

    private String permissionName;

    private String permissionNo;

    private List<ParentMenu> parentMenus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionNo() {
        return permissionNo;
    }

    public void setPermissionNo(String permissionNo) {
        this.permissionNo = permissionNo == null ? null : permissionNo.trim();
    }

    public List<ParentMenu> getParentMenus() {
        return parentMenus;
    }

    public void setParentMenus(List<ParentMenu> parentMenus) {
        this.parentMenus = parentMenus;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permissionName='" + permissionName + '\'' +
                ", permissionNo='" + permissionNo + '\'' +
                ", parentMenus='"+ parentMenus +'\''+
                '}';
    }
}