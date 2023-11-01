package com.example.orderservice.service;

import org.springframework.stereotype.Service;
import com.example.orderservice.dto.OrderRequest;
@Service
public interface OrderService {
    public String placeOrder(OrderRequest orderRequest);


}
