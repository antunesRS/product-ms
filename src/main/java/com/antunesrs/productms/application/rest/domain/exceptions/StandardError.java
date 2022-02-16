package com.antunesrs.productms.application.rest.domain.exceptions;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer status;
    private String msg;
    private Long timeStamp;
}
