package com.jpa.tutorial.repository;

import com.jpa.tutorial.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByDescription(String description);
}
