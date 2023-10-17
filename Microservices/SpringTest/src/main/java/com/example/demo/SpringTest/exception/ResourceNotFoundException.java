package com.example.demo.SpringTest.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource not found in server!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}

