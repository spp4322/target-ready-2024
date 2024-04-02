package com.targetindia.assignments.miniproject.service;

public class ServiceException extends Exception{
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
