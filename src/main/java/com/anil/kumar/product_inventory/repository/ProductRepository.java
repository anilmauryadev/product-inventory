package com.anil.kumar.product_inventory.repository;

import com.anil.kumar.product_inventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
