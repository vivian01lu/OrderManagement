package com.viv.ordermanagementsystem.service;
import com.viv.ordermanagementsystem.entity.Order;
import com.viv.ordermanagementsystem.entity.User;
import com.viv.ordermanagementsystem.repository.OrderRepository;
import com.viv.ordermanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {
        // Validate product stock and user existence (via external calls)
        return orderRepository.save(order);
    }
}