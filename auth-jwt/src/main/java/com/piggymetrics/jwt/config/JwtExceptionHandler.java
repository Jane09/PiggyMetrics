package com.piggymetrics.jwt.config;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Component
public class JwtExceptionHandler {

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(value = Exception.class)
    public String handle(Exception exception) {
        return "ERROR: "+ exception.getMessage();
    }
}
