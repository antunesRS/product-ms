package com.antunesrs.productms.application.rest.domain.exceptions;

import com.antunesrs.productms.application.rest.domain.enums.ExceptionCode;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(ExceptionCode exceptionCode) {
        super(exceptionCode.getDescription());
    }

    public ObjectNotFoundException(ExceptionCode exceptionCode, Throwable cause) {
        super(exceptionCode.getDescription(),cause);
    }
}
