package com.zhangshi.multiblog.exception;

public class TokenIsExpiredException extends RuntimeException {

    public TokenIsExpiredException(String msg){
        super(msg);
    }

    public TokenIsExpiredException(String msg, Throwable t){
        super(msg,t);
    }
}
