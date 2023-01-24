package com.jpa.tutorial.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    private int categoryId;
    private String description;

    @JsonIgnoreProperties("categories")
    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(name = "product_category",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> products;

    public void addProduct(Product product){
        if(products == null){
            products = new HashSet<>();
        }
        products.add(product);
    }

}
