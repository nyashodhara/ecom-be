package com.example.ecom.Utility;

import lombok.Data;

@Data
public class ResponseWrapper<T>{
    private final String status;
    private final String message;
    private final Integer errorCode;
    private T data;

    public ResponseWrapper(String status, String message, Integer errorCode, T data){
        this.status = status;
        this.message = message;
        this.errorCode = errorCode;
        this.data = data;
    }
}
