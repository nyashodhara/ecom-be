package com.example.ecom.Service.Impl;

import com.example.ecom.Adapter.ProductAdapter;
import com.example.ecom.Dto.ProductDto;
import com.example.ecom.Dto.ProductSearchDto;
import com.example.ecom.Entity.CategoryEntity;
import com.example.ecom.Entity.ProductEntity;
import com.example.ecom.Repository.CategoryRepository;
import com.example.ecom.Repository.ProductRepository;
import com.example.ecom.Service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<ProductDto> searchProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();
        log.info("products list" + productEntities);
        return ProductAdapter.getProductDtoList(productEntities);
    }

    @Override
    public List<ProductDto> getProductsByCategoryId(Long id) {
        CategoryEntity categoryEntity = categoryRepository.findByCategoryId(id);
        List<ProductEntity> productEntities = productRepository.findAllByCategory(categoryEntity.getCategoryId());
        return ProductAdapter.getProductDtoList(productEntities);
    }
}
