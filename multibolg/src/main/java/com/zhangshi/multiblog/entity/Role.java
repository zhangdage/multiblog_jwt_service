package com.zhangshi.multiblog.entity;

import java.util.List;

public class Role {
    private Integer id;

    private String roleName;

    private String roleNo;

    public Integer getId() {
        return id;
    }

    private List<User> users;

    private List<Permission> permissions;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo == null ? null : roleNo.trim();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleNo='" + roleNo + '\'' +
                ",users='" + users +'\''+
                ",permissions=" + permissions +'\''+
                '}';
    }
}