package com.gregory.api_users.rest.exceptionhandler.exception;

public class UserBadRequestException extends RuntimeException {

    public UserBadRequestException(String message) {
        super(message);
    }

}
