package com.dhanush.springproject.exception;

public class LoadApiNotFoundException extends RuntimeException{

    public LoadApiNotFoundException(String message){
        super(message);
    }

}
