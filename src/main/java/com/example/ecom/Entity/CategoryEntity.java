package com.example.ecom.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity(name = "category_entity")
@Table(name = "category_entity")
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "name",columnDefinition = "varchar(100) NOT NULL")
    private String name;

    @Column(name = "image",columnDefinition = "varchar(300) NOT NULL")
    private String image;

    @Column(name = "category_code",columnDefinition = "varchar(20) NOT NULL")
    private int categoryCode;
}
