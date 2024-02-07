package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public Product addProduct(Product product) {
        return productRepository.save(product);

    }


    public Optional<Product> getProductsByCategoryId(Integer categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}
