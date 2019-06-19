package com.zhangshi.multiblog.exception;

public class IllegalTokenAuthenticationException extends RuntimeException {

    public IllegalTokenAuthenticationException(String msg){
        super(msg);
    }

    public IllegalTokenAuthenticationException(String msg, Throwable t){
        super(msg,t);
    }
}
