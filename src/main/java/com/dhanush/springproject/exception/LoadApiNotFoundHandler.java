package com.dhanush.springproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//this class is for handling custom exception and existing exception
@ControllerAdvice
public class LoadApiNotFoundHandler {

    @ExceptionHandler(value = {LoadApiNotFoundException.class})
    public ResponseEntity<Object> handleLoadApiNotFoundException(LoadApiNotFoundException e){
        //1. create payload containing exception details
        HttpStatus notFoundStatus = HttpStatus.NOT_FOUND;

        LoadApiException loadApiException = new LoadApiException(
                e.getMessage(),
                notFoundStatus,
                ZonedDateTime.now(ZoneId.of("Z"))
        );

        //2. Return response entity
        return new ResponseEntity<>(loadApiException, notFoundStatus);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleGlobalException(Exception e){
        //1. create payload containing exception details
        HttpStatus internalServerError = HttpStatus.INTERNAL_SERVER_ERROR;

        LoadApiException loadApiException = new LoadApiException(
                e.getMessage(),
                internalServerError,
                ZonedDateTime.now(ZoneId.of("Z"))
        );

        //2. Return response entity
        return new ResponseEntity<>(loadApiException, internalServerError);
    }
}
