package com.example.productservice.service;

import com.example.productservice.dto.ProductRequest;
import com.example.productservice.dto.ProductResponse;
import com.example.productservice.model.Product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    public void createProduct(ProductRequest productRequest);

    public List<ProductResponse> getAllProducts();

    public ProductResponse mapToProductResponse(Product product) ;
}
