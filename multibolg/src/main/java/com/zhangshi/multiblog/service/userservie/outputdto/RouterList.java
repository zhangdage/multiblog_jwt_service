package com.zhangshi.multiblog.service.userservie.outputdto;

import java.util.List;

public class RouterList
{
    private String path;
    private String component;
    private String iconCls;
    private String name;
    private Meta meta;
    private List<RouterList> children;

    public String getPath()
    {
        return this.path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public String getComponent()
    {
        return this.component;
    }

    public void setComponent(String component)
    {
        this.component = component;
    }

    public String getIconCls()
    {
        return this.iconCls;
    }

    public void setIconCls(String iconCls)
    {
        this.iconCls = iconCls;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Meta getMeta()
    {
        return this.meta;
    }

    public void setMeta(Meta meta)
    {
        this.meta = meta;
    }

    public List<RouterList> getChildren()
    {
        return this.children;
    }

    public void setChildren(List<RouterList> children)
    {
        this.children = children;
    }

    public String toString()
    {
        return "RouterList{path='" + this.path + '\'' + ", component='" + this.component + '\'' + ", iconCls='" + this.iconCls + '\'' + ", name='" + this.name + '\'' + ", meta=" + this.meta + ", children=" + this.children + '}';
    }
}