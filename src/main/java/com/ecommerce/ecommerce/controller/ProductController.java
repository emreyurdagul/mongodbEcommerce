package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.Category;
import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {



    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable("categoryId") Integer categoryId) {
        return productService.getProductsByCategoryId(categoryId);
    }

    @GetMapping("/category")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/subcategory/{parentId}")
    public List<Category> getSubCategories(@PathVariable Integer parentId){
        return productService.getSubCategories(parentId);
    }

    @GetMapping("/allsubcategory/{parentId}")
    public List<Category> getAllSubCategories(@PathVariable Integer parentId){
        return productService.getAllSubCategories(parentId);
    }

    @GetMapping("/attributes/{categoryId}")
    public List<Product.Attribute> getAttributes(@PathVariable Integer categoryId){
        return productService.getAllAttributesOfSpecificCategoryProducts(categoryId);
    }


}
