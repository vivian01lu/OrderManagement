package com.viv.ordermanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // From User Service
    private Long productId; // From Inventory Service
    private Integer quantity;

    private String status; // e.g., PENDING, COMPLETED
    private LocalDateTime orderDate;
}