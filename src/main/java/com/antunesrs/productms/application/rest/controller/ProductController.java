package com.antunesrs.productms.application.rest.controller;

import com.antunesrs.productms.application.rest.dto.ProductDTO;
import com.antunesrs.productms.application.rest.model.Product;
import com.antunesrs.productms.application.rest.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDTO addProduct(@RequestBody @Valid ProductDTO product){
        Product entity = modelMapper.map(product, Product.class);

        return modelMapper.map(service.save(entity), ProductDTO.class);
    }
}
