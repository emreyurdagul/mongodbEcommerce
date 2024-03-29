package com.ecommerce.ecommerce.repositories;

import com.ecommerce.ecommerce.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {


    List<Product> findByCategoryId(Integer categoryId);




}
