package com.example.ecom.Controller;

import com.example.ecom.Dto.CategoryDto;
import com.example.ecom.Dto.ProductDto;
import com.example.ecom.Dto.ProductSearchDto;
import com.example.ecom.Service.ProductService;
import com.example.ecom.Utility.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/list")
    public ResponseWrapper<List<ProductDto>> searchProducts(){
        List<ProductDto> productDtos = productService.searchProducts();
        return new ResponseWrapper<>("Success","Success",200,productDtos);
    }

    @GetMapping(value = "/{id}")
    public ResponseWrapper<List<ProductDto>> getProductsByCategoryId(Long id){
        List<ProductDto> productDtos = productService.getProductsByCategoryId(id);
        return new ResponseWrapper<>("Success","Success",200,productDtos);
    }
}
