package com.sg.productservice.service;

import com.sg.productservice.dto.ProductRequest;
import com.sg.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
}
