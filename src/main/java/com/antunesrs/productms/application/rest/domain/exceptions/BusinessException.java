package com.antunesrs.productms.application.rest.domain.exceptions;

import com.antunesrs.productms.application.rest.domain.enums.ExceptionCode;

public class BusinessException extends RuntimeException{

    public BusinessException(ExceptionCode exceptionCode){
        super(exceptionCode.getDescription());
    }

    public BusinessException(ExceptionCode exceptionCode, Throwable cause){
        super(exceptionCode.getDescription(), cause);
    }
}
