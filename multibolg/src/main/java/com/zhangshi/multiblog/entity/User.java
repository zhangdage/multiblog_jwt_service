package com.zhangshi.multiblog.entity;

import java.util.List;

public class User {
    private Integer id;

    private String userName;

    private String userNo;

    private String password;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public User() {
    }

    public User(User user) {
        id = user.id;
        userName = user.userName;
        userNo = user.userNo;
        password = user.password;
        roles = user.roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }



    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userNo='" + userNo + '\'' +
                ", password='" + password + '\'' +
                ",roles="+roles+'\''+
                '}';
    }
}