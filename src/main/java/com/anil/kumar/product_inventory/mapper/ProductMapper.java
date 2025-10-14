package com.anil.kumar.product_inventory.mapper;

import com.anil.kumar.product_inventory.dto.ProductRequest;
import com.anil.kumar.product_inventory.dto.ProductResponse;
import com.anil.kumar.product_inventory.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequest request) {
        if (request == null) return null;
        return Product.builder()
                .name(request.name())
                .description(request.description())
                .price(request.price())
                .quantity(request.quantity())
                .build();
    }

    public ProductResponse toResponse(Product product) {
        if (product == null) return null;
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getQuantity()
        );
    }
}
