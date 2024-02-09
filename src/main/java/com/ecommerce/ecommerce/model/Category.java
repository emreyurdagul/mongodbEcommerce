package com.ecommerce.ecommerce.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor //
@AllArgsConstructor
@Document(collection = "categories")
public class Category {
    @Id
    private String id;
    @Field(name = "id")
    private Integer categoryId;
    private String name;
    @Field(name = "parent_id")
    private Integer parentId; // Allows null for top-level categories
}
