package com.abhishek.hotelService.exception;

public class ResorceNotFoundException extends RuntimeException {

    public ResorceNotFoundException()
    {
        super("Resource not found in server!");
    }
    public ResorceNotFoundException(String message)
    {
       super(message);
    }
}
