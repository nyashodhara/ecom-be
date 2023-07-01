package com.example.ecom.Service;

import com.example.ecom.Dto.ProductDto;
import com.example.ecom.Dto.ProductSearchDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> searchProducts();

    List<ProductDto> getProductsByCategoryId(Long id);

    ProductDto getProductsById(Long id);
}
