package com.example.inventoryservice.service;

import org.springframework.stereotype.Service;

@Service
public interface InventoryService {
    public boolean isInStock(String skuCode);
}
