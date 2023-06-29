package com.example.ecom.Service.Impl;

import com.example.ecom.Adapter.CategoryAdapter;
import com.example.ecom.Dto.CategoryDto;
import com.example.ecom.Entity.CategoryEntity;
import com.example.ecom.Repository.CategoryRepository;
import com.example.ecom.Service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getCategories() {
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();
        log.info("categories" + categoryEntities);
        return CategoryAdapter.getCategoryDtoList(categoryEntities);
    }
}
