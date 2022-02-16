package com.antunesrs.productms.application.rest.domain.services;

import com.antunesrs.productms.application.rest.domain.enums.ExceptionCode;
import com.antunesrs.productms.application.rest.domain.exceptions.ObjectNotFoundException;
import com.antunesrs.productms.application.rest.domain.model.Product;
import com.antunesrs.productms.application.rest.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product save(Product product){
        return repository.save(product);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> product = repository.findById(id);

        return product.orElseThrow(() -> new ObjectNotFoundException(ExceptionCode.NOT_FOUND));
    }
}
