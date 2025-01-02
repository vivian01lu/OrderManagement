package com.viv.ordermanagementsystem.repository;


import com.viv.ordermanagementsystem.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}