package com.abhishek.hotelService.exception;

public class ResorceNotFoundExceptions extends RuntimeException{

    public ResorceNotFoundExceptions()
    {
        super("Not found in server");
    }
    public ResorceNotFoundExceptions(String message)
    {
        super(message);
    }
}
