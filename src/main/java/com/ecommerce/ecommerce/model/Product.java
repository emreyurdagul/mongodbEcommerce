package com.ecommerce.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {
    @Id
    private String id; // MongoDB document ID
    private String title;
    @Field(name = "category_id")
    private Integer categoryId;
    private String url;
    private Double price;
    private Boolean inStock;
    private String thumbnailImage;
    private List<Attribute> attributes;
    // Constructors, getters, and setters


    @Data
    public static class Attribute {
        private String key;
        private String value;

        // Constructors, getters, and setters
    }
}
