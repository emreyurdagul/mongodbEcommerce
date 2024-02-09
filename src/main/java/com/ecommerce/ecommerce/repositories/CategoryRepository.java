package com.ecommerce.ecommerce.repositories;

import com.ecommerce.ecommerce.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CategoryRepository extends MongoRepository<Category, String> {

    List<Category> findByParentId(Integer parentId);


}
