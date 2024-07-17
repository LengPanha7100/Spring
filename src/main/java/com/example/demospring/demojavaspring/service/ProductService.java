package com.example.demospring.demojavaspring.service;

import com.example.demospring.demojavaspring.model.Product;
import com.example.demospring.demojavaspring.model.ProductRequest;

import java.util.List;

public interface ProductService {
    Product createCustomer(ProductRequest productRequest);

    Product getProductById(Integer id);

    List<Product> getAllProduct();

    Product updateProduct(Integer id, ProductRequest productRequest);
}
