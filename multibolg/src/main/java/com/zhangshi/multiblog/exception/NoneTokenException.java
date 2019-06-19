package com.zhangshi.multiblog.exception;

public class NoneTokenException extends RuntimeException{

    public NoneTokenException(String msg){
        super(msg);
    }

    public NoneTokenException(String msg, Throwable t){
        super(msg,t);
    }
}
