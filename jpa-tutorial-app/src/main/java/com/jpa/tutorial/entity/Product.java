package com.jpa.tutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private int productId;
    private String description;
    @Enumerated(EnumType.STRING)//mapping enum values to data base by string value
    private ProductStatus productStatus;
    @ManyToMany(mappedBy = "products")
    private Set<Category> categories;
}
