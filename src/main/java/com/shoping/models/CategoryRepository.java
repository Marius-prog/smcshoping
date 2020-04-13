package com.shoping.models;

import com.shoping.models.data.Category;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryRepository extends JpaRepository<Category, Integer> {



}
