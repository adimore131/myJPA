package com.jpa.tutorial.repository;

import com.jpa.tutorial.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByDescription(String description);
    Product findByProductId(int id);
}
