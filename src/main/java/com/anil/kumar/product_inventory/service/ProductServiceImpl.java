package com.anil.kumar.product_inventory.service;

import com.anil.kumar.product_inventory.dto.ProductRequest;
import com.anil.kumar.product_inventory.dto.ProductResponse;
import com.anil.kumar.product_inventory.entity.Product;
import com.anil.kumar.product_inventory.exception.ResourceNotFoundException;
import com.anil.kumar.product_inventory.mapper.ProductMapper;
import com.anil.kumar.product_inventory.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Override
    public ProductResponse createProduct(ProductRequest request) {
        Product product = mapper.toEntity(request);
        return mapper.toResponse(repository.save(product));
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public ProductResponse getProductById(Long id) {
        return repository.findById(id)
                .map(mapper::toResponse)
                .orElseThrow(() -> new ResourceNotFoundException("Product with ID " + id + " not found"));
    }

    @Override
    public ProductResponse updateProduct(Long id, ProductRequest request) {
        Product existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product with ID " + id + " not found"));

        existing.setName(request.name());
        existing.setDescription(request.description());
        existing.setPrice(request.price());
        existing.setQuantity(request.quantity());

        return mapper.toResponse(repository.save(existing));
    }

    @Override
    public void deleteProduct(Long id) {
        Product existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product with ID " + id + " not found"));
        repository.deleteById(id);
    }
}
