package com.example.ecom.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ProductDto {
    private Long productId;
    private String name;
    private Long category;
    private Double price;
    private String images;
    private String description;
}
