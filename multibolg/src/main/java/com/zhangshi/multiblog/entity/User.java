package com.zhangshi.multiblog.entity;

import java.util.List;

public class User
{
    private Integer id;
    private String userName;
    private String userNo;
    private String password;
    private List<Role> roles;
    private String name;
    private String phone;
    private String address;
    private String telephone;
    private String userface;
    private String remark;
    private User user;
    private boolean enabled;

    public List<Role> getRoles()
    {
        return this.roles;
    }

    public void setRoles(List<Role> roles)
    {
        this.roles = roles;
    }

    public User() {}

    public User(User user)
    {
        this.id = user.id;
        this.userName = user.userName;
        this.userNo = user.userNo;
        this.password = user.password;
        this.roles = user.roles;
        this.name = user.name;
        this.phone = user.phone;
        this.address = user.address;
        this.telephone = user.telephone;
        this.userface = user.userface;
        this.enabled = user.enabled;
        this.remark = user.remark;
        this.user = user;
    }

    public User returnSecureUser()
    {
        User secureUser = this.user;
        secureUser.password = null;
        return secureUser;
    }

    public Integer getId()
    {
        return this.id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUserName()
    {
        return this.userName;
    }

    public void setUserName(String userName)
    {
        this.userName = (userName == null ? null : userName.trim());
    }

    public String getUserNo()
    {
        return this.userNo;
    }

    public void setUserNo(String userNo)
    {
        this.userNo = (userNo == null ? null : userNo.trim());
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String password)
    {
        this.password = (password == null ? null : password.trim());
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhone()
    {
        return this.phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getTelephone()
    {
        return this.telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getUserface()
    {
        return this.userface;
    }

    public void setUserface(String userface)
    {
        this.userface = userface;
    }

    public String getRemark()
    {
        return this.remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public boolean isEnabled()
    {
        return this.enabled;
    }

    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    public String toString()
    {
        return "User{id=" + this.id + ", userName='" + this.userName + '\'' + ", userNo='" + this.userNo + '\'' + ", password='" + this.password + '\'' + ", roles=" + this.roles + ", name='" + this.name + '\'' + ", phone='" + this.phone + '\'' + ", address='" + this.address + '\'' + ", telephone='" + this.telephone + '\'' + ", userface='" + this.userface + '\'' + ", remark='" + this.remark + '\'' + ", enabled=" + this.enabled + '}';
    }
}
