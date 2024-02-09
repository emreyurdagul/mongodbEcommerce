package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.model.Category;
import com.ecommerce.ecommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findSubCategoriesOfParent(Integer parentId){
        return categoryRepository.findByParentId(parentId);
    }


    public List<Category> findAllSubCategoriesOfParent(Integer parentId) {
        List<Category> allSubCategories = new ArrayList<>();
        findAllSubCategoriesRecursive(parentId, allSubCategories);
        return allSubCategories;
    }

    private void findAllSubCategoriesRecursive(Integer parentId, List<Category> allSubCategories) {
        List<Category> subCategories = findSubCategoriesOfParent(parentId);
        for (Category subCategory : subCategories) {
            allSubCategories.add(subCategory);
            findAllSubCategoriesRecursive(subCategory.getCategoryId(), allSubCategories); // Recursive call
        }
    }




}
