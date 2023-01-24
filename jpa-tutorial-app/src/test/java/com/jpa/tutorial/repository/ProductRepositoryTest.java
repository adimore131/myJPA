package com.jpa.tutorial.repository;

import com.jpa.tutorial.entity.Category;
import com.jpa.tutorial.entity.Product;
import com.jpa.tutorial.entity.ProductStatus;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@DataJpaTest
class ProductRepositoryTest {
    /// == Fields ==
    @Autowired
    CategoryRepository repo;

    @Autowired
    ProductRepository proRepo;

    // == Test methods ==
    @Test
    @Order(1)
    @Commit
    void testGetCategories(){
        Product product = new Product();
        product.setDescription("Product1");
        product.setProductId(1);
        product.setProductStatus(ProductStatus.NEW);
        Product product1 = new Product();
        product1.setDescription("Product2");
        product1.setProductId(2);
        product1.setProductStatus(ProductStatus.COMPLETE);


        Category category = new Category();
        category.setCategoryId(1);
        category.setDescription("Category1");
        Set<Product> products = new HashSet<>();
        products.add(product);
        products.add(product1);
        category.setProducts(products);
        //persist
        Category saved = repo.save(category);
        System.out.println(saved);
        assertThat(saved.getProducts()).isNotNull();
    }

    @Test
    @Order(2)
    void testCategoriesByDescription(){
        Category fetched = repo.findByDescription("Category1");
        assertThat(fetched).isNotNull();
    }

//    @Test
//    @Order(3)
//    void testProductByDescription(){
//        Product fetched = proRepo.findByProductId(1);
//        System.out.println("This is the result" + fetched);
//        assertThat(fetched).isNotNull();
//
//    }

}