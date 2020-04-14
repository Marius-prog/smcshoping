package com.shoping.models;

import com.shoping.models.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    Product findBySlug(String slug);
}
