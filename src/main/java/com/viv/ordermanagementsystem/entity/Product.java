package com.viv.ordermanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer stockQuantity;

    @ManyToOne
    private Shop shop;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}