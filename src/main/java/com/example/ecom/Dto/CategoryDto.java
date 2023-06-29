package com.example.ecom.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CategoryDto {

    private Long categoryId;
    private String name;
    private String image;
    private String categoryCode;
}
