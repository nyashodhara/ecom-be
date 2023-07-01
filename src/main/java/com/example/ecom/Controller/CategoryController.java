package com.example.ecom.Controller;

import com.example.ecom.Dto.CategoryDto;
import com.example.ecom.Service.CategoryService;
import com.example.ecom.Utility.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/list")
    public ResponseWrapper<List<CategoryDto>> getCategories() {
        List<CategoryDto> categoryDtos = categoryService.getCategories();
        return new ResponseWrapper<>("Success", "Success", 200, categoryDtos);
    }

    @GetMapping(value = "/{id}")
    public ResponseWrapper<CategoryDto> getCategoryById(@PathVariable Long id) {
        CategoryDto categoryDto = categoryService.getCategoryById(id);
        return new ResponseWrapper<>("Success", "Success", 200, categoryDto);
    }
}
