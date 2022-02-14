package com.antunesrs.productms.application.rest.services;

import com.antunesrs.productms.application.rest.model.Product;
import com.antunesrs.productms.application.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product save(Product product){
        return repository.save(product);
    }
}
