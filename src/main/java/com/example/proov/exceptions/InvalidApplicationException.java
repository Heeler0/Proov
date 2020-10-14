package com.example.proov.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidApplicationException extends RuntimeException {

    public InvalidApplicationException() {

    }

    public InvalidApplicationException(String message) {
        super();
    }
}
