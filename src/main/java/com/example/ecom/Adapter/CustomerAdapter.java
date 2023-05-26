package com.example.ecom.Adapter;

import com.example.ecom.Dto.CustomerDto;
import com.example.ecom.Entity.CustomerEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerAdapter {
    public CustomerDto customerEntityToDto(CustomerEntity customerEntity){
        return CustomerDto.builder()
                .customerId(customerEntity.getCustomerId())
                .mobile(customerEntity.getMobile())
                .name(customerEntity.getName())
                .otp(customerEntity.getOtp())
                .otpExpiry(customerEntity.getOtpExpiry()).build();
    }

    public CustomerEntity customerDtoToEntity(CustomerDto customerDto){
        return CustomerEntity.builder()
                .customerId(customerDto.getCustomerId())
                .mobile(customerDto.getMobile())
                .name(customerDto.getName())
                .otp(customerDto.getOtp())
                .otpExpiry(customerDto.getOtpExpiry()).build();
    }
}
