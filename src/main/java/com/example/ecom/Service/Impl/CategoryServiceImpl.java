package com.example.ecom.Service.Impl;

import com.example.ecom.Adapter.CategoryAdapter;
import com.example.ecom.Dto.CategoryDto;
import com.example.ecom.Entity.CategoryEntity;
import com.example.ecom.Repository.CategoryRepository;
import com.example.ecom.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getCategories() {
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();
        return CategoryAdapter.getCategoryDtoList(categoryEntities);
    }
}
