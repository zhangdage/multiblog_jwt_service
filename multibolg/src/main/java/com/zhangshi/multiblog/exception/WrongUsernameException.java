package com.zhangshi.multiblog.exception;

public class WrongUsernameException extends RuntimeException{

    public WrongUsernameException(String message) {
        super(message);
    }

    public WrongUsernameException(String message, Throwable cause) {
        super(message, cause);
    }
}
