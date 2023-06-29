package com.example.ecom.Adapter;

import com.example.ecom.Dto.CategoryDto;
import com.example.ecom.Entity.CategoryEntity;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class CategoryAdapter {
    public CategoryDto categoryEntityToDto(CategoryEntity categoryEntity){
        return CategoryDto.builder()
                .categoryId(categoryEntity.getCategoryId())
                .name(categoryEntity.getName())
                .image(categoryEntity.getImage())
                .categoryCode(categoryEntity.getCategoryCode()).build();
    }

    public List<CategoryDto> getCategoryDtoList(List<CategoryEntity> categoryEntities){
        return categoryEntities.stream().map(CategoryAdapter::categoryEntityToDto).collect(Collectors.toList());
    }
}
