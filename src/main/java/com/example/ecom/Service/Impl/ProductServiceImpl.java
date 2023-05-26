package com.example.ecom.Service.Impl;

import com.example.ecom.Adapter.ProductAdapter;
import com.example.ecom.Dto.ProductDto;
import com.example.ecom.Dto.ProductSearchDto;
import com.example.ecom.Entity.ProductEntity;
import com.example.ecom.Repository.ProductRepository;
import com.example.ecom.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> searchProducts(ProductSearchDto productSearchDto) {
        List<ProductEntity> productEntities = productRepository.findAll();
        return ProductAdapter.getProductDtoList(productEntities);
    }
}
