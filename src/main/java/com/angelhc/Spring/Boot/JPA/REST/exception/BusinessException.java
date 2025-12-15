package com.angelhc.Spring.Boot.JPA.REST.exception;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
