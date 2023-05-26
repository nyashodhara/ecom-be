package com.example.ecom.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity(name = "product_entity")
@Table(name = "product_entity")
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "name",columnDefinition = "varchar(100) NOT NULL")
    private String name;

    @Column(name = "image",columnDefinition = "varchar(300) NOT NULL")
    private String image;

    @Column(name = "price",columnDefinition = "double NOT NULL")
    private Double price;

    @Column(name = "category_id",columnDefinition = "int DEFAULT NULL")
    private int category;
}
