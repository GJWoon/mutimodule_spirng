package org.example.exceptionhandler;


import org.example.enums.CodeEnum;
import org.example.exception.CustomException;
import org.example.response.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public CommonResponse handlerCustomException(CustomException e){

    return new CommonResponse(e.getReturnCode(),e.getReturnMessage());

    }

    @ExceptionHandler(Exception.class)
    public CommonResponse handlerException(Exception e){
        return new CommonResponse(CodeEnum.UNKNOWN_ERROR);
    }
}
