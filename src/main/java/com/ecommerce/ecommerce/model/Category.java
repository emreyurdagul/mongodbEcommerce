package com.ecommerce.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //
@Document(collection = "categories")
public class Category {
    @Id
    private Integer id;
    private String name;
    private Integer parent_id; // Allows null for top-level categories
}
