package com.example.inventoryservice.service;

import com.example.inventoryservice.dto.InventoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InventoryService {
    public List<InventoryResponse> isInStock(List<String> skuCode);
}
