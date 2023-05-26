package com.example.ecom.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CustomerDto {
    private Long customerId;

    private String name;

    private String mobile;

    private String otp;

    private Date otpExpiry;

    private String password;
}
