package com.varma.restdemo.responce;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(String message, HttpStatus httpStatus, Object responseObject)
    {
        Map<String,Object> response=new LinkedHashMap<>();
        response.put("data",responseObject);
        response.put("httpstatus",httpStatus);
        response.put("message",message);

        return new ResponseEntity<>(response,httpStatus);

    }
}
