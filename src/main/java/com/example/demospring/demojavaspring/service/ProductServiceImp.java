package com.example.demospring.demojavaspring.service;

import com.example.demospring.demojavaspring.model.Product;
import com.example.demospring.demojavaspring.model.ProductRequest;
import com.example.demospring.demojavaspring.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImp implements ProductService {
    public final ProductRepository productRepository;
    @Override
    public Product createCustomer(ProductRequest customerRequest) {
        return productRepository.createCustomer(productRepository);
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.getProductById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    @Override
    public Product updateProduct(Integer id, ProductRequest productRequest) {
        return productRepository.updateProduct(id,productRequest);
    }
}
