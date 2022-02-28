package com.antunesrs.productms.application.rest.domain.repository;

import com.antunesrs.productms.application.rest.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public boolean existsByBarCode(String barCode);
}
