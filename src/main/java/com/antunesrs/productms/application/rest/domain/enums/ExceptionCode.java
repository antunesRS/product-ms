package com.antunesrs.productms.application.rest.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExceptionCode {
    NOT_FOUND("Product not found"),
    DUPLICATED_BAR_CODE("Barcode duplicated");

    private String description;


}
