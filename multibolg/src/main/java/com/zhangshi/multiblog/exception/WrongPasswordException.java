package com.zhangshi.multiblog.exception;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}
