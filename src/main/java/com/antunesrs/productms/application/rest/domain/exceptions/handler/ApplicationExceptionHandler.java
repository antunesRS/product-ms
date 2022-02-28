package com.antunesrs.productms.application.rest.domain.exceptions.handler;

import com.antunesrs.productms.application.rest.domain.exceptions.ApiErrors;
import com.antunesrs.productms.application.rest.domain.exceptions.BusinessException;
import com.antunesrs.productms.application.rest.domain.exceptions.ObjectNotFoundException;
import com.antunesrs.productms.application.rest.domain.exceptions.StandardError;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public StandardError handleValidationExceptions(MethodArgumentNotValidException e){

        BindingResult bindingResult = e.getBindingResult();
        StandardError standardError = new StandardError(HttpStatus.BAD_REQUEST.value(), "TESTE", System.currentTimeMillis());
        return standardError;
        //return new ApiErrors(bindingResult);
    }


    @ExceptionHandler(ObjectNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public StandardError handleObjectNotFoundException(ObjectNotFoundException e){
        return new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public StandardError handleInternalServerException(Exception e){
        return new StandardError(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(), System.currentTimeMillis());
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public StandardError handleBusinessException(Exception e){
        return new StandardError(HttpStatus.UNPROCESSABLE_ENTITY.value(), e.getMessage(), System.currentTimeMillis());
    }


}
