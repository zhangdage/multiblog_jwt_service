package com.zhangshi.multiblog.exception;

public class FriendlyWrongException
        extends RuntimeException
{
    public FriendlyWrongException(String message)
    {
        super(message);
    }

    public FriendlyWrongException(String message, Throwable cause)
    {
        super(message, cause);
    }
}

