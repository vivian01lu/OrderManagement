package com.viv.ordermanagementsystem.service;

import com.viv.ordermanagementsystem.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private ProductRepository productRepository;

    public Product updateStock(Long productId, Integer newQuantity) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        product.setStockQuantity(newQuantity);
        return productRepository.save(product);
    }
}