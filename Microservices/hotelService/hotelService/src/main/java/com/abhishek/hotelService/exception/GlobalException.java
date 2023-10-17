package com.abhishek.hotelService.exception;


import com.abhishek.hotelService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(ResorceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResorceNotFoundException(ResorceNotFoundException ex)
    {
        String msg = ex.getMessage();
        ApiResponse apiResponse = ApiResponse.builder().message(msg).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(ResorceNotFoundExceptions.class)
    public ResponseEntity<Map<String,Object>> handleResorceNotFoundExceptions(ResorceNotFoundExceptions ex)
    {
        Map map = new HashMap();
        map.put("message",ex.getMessage());
        map.put("success",true);
        map.put("Status",HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }
}
