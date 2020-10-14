package com.example.proov.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidServiceException extends RuntimeException {

    public InvalidServiceException() {

    }

    public InvalidServiceException(String message) {
        super();
    }
}
