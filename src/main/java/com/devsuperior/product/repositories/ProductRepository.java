package com.devsuperior.product.repositories;


import com.devsuperior.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT obj FROM Product obj JOIN FETCH obj.categories")
    List<Product> searchall();
}
