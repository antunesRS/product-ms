package com.antunesrs.productms.application.rest.domain.exceptions.handler;

import com.antunesrs.productms.application.rest.domain.enums.ExceptionCode;
import com.antunesrs.productms.application.rest.domain.exceptions.BusinessException;

public class DuplicatedBarCodeException extends BusinessException {

    public DuplicatedBarCodeException(ExceptionCode exceptionCode) {
        super(exceptionCode);
    }

    public DuplicatedBarCodeException(ExceptionCode exceptionCode, Throwable cause) {
        super(exceptionCode, cause);
    }
}
