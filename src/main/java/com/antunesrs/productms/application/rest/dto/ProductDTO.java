package com.antunesrs.productms.application.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String barCode;

    @NotEmpty
    private String description;

    @NotNull
    private Double price;

    @NotEmpty
    private String brand;

    private Date dueDate;
}
