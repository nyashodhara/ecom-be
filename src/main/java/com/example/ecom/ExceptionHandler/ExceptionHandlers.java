package com.example.ecom.ExceptionHandler;

import com.example.ecom.Utility.ResponseWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class ExceptionHandlers {
    @ExceptionHandler(DuplicateException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ResponseWrapper<Object> HandleDuplicateException(DuplicateException duplicateException){
        log.debug(duplicateException.getResult());
        return new ResponseWrapper<>("Failure", duplicateException.getResult(), 200,null);
    }
}
