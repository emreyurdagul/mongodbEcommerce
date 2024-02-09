package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.model.Category;
import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryService categoryService;

    public Product addProduct(Product product) {
        return productRepository.save(product);


    }


    public List<Product> getProductsByCategoryId(Integer categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }


    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public List<Category> getSubCategories(Integer parentId) {
        return categoryService.findSubCategoriesOfParent(parentId);
    }

    public List<Category> getAllSubCategories(Integer parentId) {
        return categoryService.findAllSubCategoriesOfParent(parentId);
    }

    public List<Product.Attribute> getAllAttributesOfSpecificCategoryProducts(Integer categoryId) {
        List<Product> products = productRepository.findByCategoryId(categoryId);
        System.out.println(products.get(0).toString());
        List<Product.Attribute> attributes = new ArrayList<>();

        for (Product product : products) {
            attributes.addAll(product.getAttributes());
        }

        return attributes;
    }
}
