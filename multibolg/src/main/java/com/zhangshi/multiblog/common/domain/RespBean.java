package com.zhangshi.multiblog.common.domain;

public class RespBean
{
    private Integer status;
    private String msg;
    private Object obj;

    private RespBean() {}

    public static RespBean build()
    {
        return new RespBean();
    }

    public static RespBean ok(String msg, Object obj)
    {
        return new RespBean(Integer.valueOf(200), msg, obj);
    }

    public static RespBean ok(String msg)
    {
        return new RespBean(Integer.valueOf(200), msg, null);
    }

    public static RespBean error(String msg, Object obj)
    {
        return new RespBean(Integer.valueOf(500), msg, obj);
    }

    public static RespBean error(String msg)
    {
        return new RespBean(Integer.valueOf(500), msg, null);
    }

    private RespBean(Integer status, String msg, Object obj)
    {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    public Integer getStatus()
    {
        return this.status;
    }

    public RespBean setStatus(Integer status)
    {
        this.status = status;
        return this;
    }

    public String getMsg()
    {
        return this.msg;
    }

    public RespBean setMsg(String msg)
    {
        this.msg = msg;
        return this;
    }

    public Object getObj()
    {
        return this.obj;
    }

    public RespBean setObj(Object obj)
    {
        this.obj = obj;
        return this;
    }
}