package com.antunesrs.productms.application.rest.controller;

import com.antunesrs.productms.application.rest.domain.dto.ProductDTO;
import com.antunesrs.productms.application.rest.domain.model.Product;
import com.antunesrs.productms.application.rest.domain.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

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

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> getProducts(){
        List<ProductDTO> productsDTO = new ArrayList<>();
        List<Product> products = service.getProducts();

        products.forEach(product -> {
           ProductDTO productDTO =  modelMapper.map(product, ProductDTO.class);
            productsDTO.add(productDTO);
        });

        return productsDTO;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductDTO findById(@PathVariable Long id){
        Product product = service.findById(id);

        return modelMapper.map(product, ProductDTO.class);
    }
}
