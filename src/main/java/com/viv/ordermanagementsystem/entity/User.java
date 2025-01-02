package com.viv.ordermanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password; // Use hashing for passwords
    private String role; // e.g., ADMIN, CUSTOMER
}