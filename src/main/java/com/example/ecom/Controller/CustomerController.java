package com.example.ecom.Controller;

import com.example.ecom.Dto.CustomerDto;
import com.example.ecom.Service.CustomerService;
import com.example.ecom.Utility.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/register")
    public ResponseWrapper<CustomerDto> customerRegister(@RequestBody CustomerDto customerDto){
        customerDto = customerService.registerCustomer(customerDto);
        return new ResponseWrapper<>("Success","Success",200,customerDto);
    }

    @PostMapping("/login")
    public ResponseWrapper<CustomerDto> customerLogin(@RequestBody CustomerDto customerDto){
        customerDto = customerService.customerLogin(customerDto);
        return new ResponseWrapper<>("Success","Success",200,customerDto);
    }
}
