package com.example.ecom.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "customer_entity")
@Table(name = "customer_entity")
@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "name")
    private String name;

    @Column(name = "mobile",columnDefinition = "varchar(100) NOT NULL")
    private String mobile;

    @Column(name = "otp",columnDefinition = "varchar(6) DEFAULT NULL")
    private String otp;

    @Column(name = "otp_expiry",columnDefinition = "DATETIME")
    private Date otpExpiry;

    @Column(name = "password",columnDefinition = "varchar(100) DEFAULT NULL")
    private String password;
}
