package com.example.ecom.Repository;

import com.example.ecom.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {

    CustomerEntity findFirstByMobile(String mobile);
}
