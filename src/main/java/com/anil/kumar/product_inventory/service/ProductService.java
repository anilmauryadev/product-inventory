package com.anil.kumar.product_inventory.service;

import com.anil.kumar.product_inventory.dto.ProductRequest;
import com.anil.kumar.product_inventory.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse createProduct(ProductRequest request);
    List<ProductResponse> getAllProducts();
    ProductResponse getProductById(Long id);
    ProductResponse updateProduct(Long id, ProductRequest request);
    void deleteProduct(Long id);
}
