package com.zhangshi.multiblog.service.userservie.outputdto;

class Meta
{
    private boolean keepAlive;
    private boolean requireAuth;

    public boolean isKeepAlive()
    {
        return this.keepAlive;
    }

    public void setKeepAlive(boolean keepAlive)
    {
        this.keepAlive = keepAlive;
    }

    public boolean isRequireAuth()
    {
        return this.requireAuth;
    }

    public void setRequireAuth(boolean requireAuth)
    {
        this.requireAuth = requireAuth;
    }

    public String toString()
    {
        return "Meta{keepAlive=" + this.keepAlive + ", requireAuth=" + this.requireAuth + '}';
    }
}
