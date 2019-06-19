package com.zhangshi.multiblog.entity;

public class ChildMenu extends ChildMenuKey {
    private String childMenuName;

    private String childMenuNo;

    public String getChildMenuName() {
        return childMenuName;
    }

    public void setChildMenuName(String childMenuName) {
        this.childMenuName = childMenuName == null ? null : childMenuName.trim();
    }

    public String getChildMenuNo() {
        return childMenuNo;
    }

    public void setChildMenuNo(String childMenuNo) {
        this.childMenuNo = childMenuNo == null ? null : childMenuNo.trim();
    }

    @Override
    public String toString() {
        return "ChildMenu{" +
                "id=" + id +
                ", childMenuName='" + childMenuName + '\'' +
                ", childMenuNo='" + childMenuNo + '\'' +
                '}';
    }
}