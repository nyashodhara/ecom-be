package com.example.ecom.ExceptionHandler;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DuplicateException extends RuntimeException{
    private final String result;

    public DuplicateException(String result){
        this.result = result;
    }
}
