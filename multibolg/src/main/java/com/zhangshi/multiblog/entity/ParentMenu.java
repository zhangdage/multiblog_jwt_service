package com.zhangshi.multiblog.entity;

import java.util.List;

public class ParentMenu {
    private Integer id;

    private String parentMenuName;

    private String parentMenuNo;

    private List<ChildMenu> childMenus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentMenuName() {
        return parentMenuName;
    }

    public void setParentMenuName(String parentMenuName) {
        this.parentMenuName = parentMenuName == null ? null : parentMenuName.trim();
    }

    public String getParentMenuNo() {
        return parentMenuNo;
    }

    public void setParentMenuNo(String parentMenuNo) {
        this.parentMenuNo = parentMenuNo == null ? null : parentMenuNo.trim();
    }

    public List<ChildMenu> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<ChildMenu> childMenus) {
        this.childMenus = childMenus;
    }

    @Override
    public String toString() {
        return "ParentMenu{" +
                "id=" + id +
                ", parentMenuName='" + parentMenuName + '\'' +
                ", parentMenuNo='" + parentMenuNo + '\'' +
                ", childMenus='" + childMenus +'\'' +
                '}';
    }
}