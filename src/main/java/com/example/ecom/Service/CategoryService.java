package com.example.ecom.Service;

import com.example.ecom.Dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getCategories();

    CategoryDto getCategoryById(Long id);
}
