package com.example.ecom.Service;

import com.example.ecom.Dto.CustomerDto;

public interface CustomerService {

    CustomerDto registerCustomer(CustomerDto customerDto);

    CustomerDto customerLogin(CustomerDto customerDto);
}
