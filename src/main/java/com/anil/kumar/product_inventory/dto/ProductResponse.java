package com.anil.kumar.product_inventory.dto;

public record ProductResponse(
        Long id,
        String name,
        String description,
        Double price,
        Integer quantity
) {}
