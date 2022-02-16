package com.antunesrs.productms.application.rest.domain.dto;

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

    @NotEmpty(message = "Preenchimento obrigatório")
    private String name;

    @NotEmpty(message = "Preenchimento obrigatório")
    private String barCode;

    @NotEmpty(message = "Preenchimento obrigatório")
    private String description;

    @NotNull(message = "Preenchimento obrigatório")
    private Double price;

    @NotEmpty(message = "Preenchimento obrigatório")
    private String brand;

    private Date dueDate;
}
