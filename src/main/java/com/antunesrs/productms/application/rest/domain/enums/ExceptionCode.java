package com.antunesrs.productms.application.rest.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExceptionCode {
    NOT_FOUND("Product not found");

    private String description;


}
