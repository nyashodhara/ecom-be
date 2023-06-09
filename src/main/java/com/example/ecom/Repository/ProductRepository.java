package com.example.ecom.Repository;

import com.example.ecom.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    List<ProductEntity> findAllByCategory(Long id);

    ProductEntity findByProductId(Long id);
}
