package com.example.demospring.demojavaspring.controller;
import com.example.demospring.demojavaspring.model.Product;
import com.example.demospring.demojavaspring.model.ProductRequest;
import com.example.demospring.demojavaspring.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class ProductController {
    public final ProductService productService;
    @PostMapping
    public ResponseEntity<?> createCustomer(@RequestBody ProductRequest customerRequest){
        Product customer = productService.createCustomer(customerRequest);
        return ResponseEntity.ok(customer);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getProductById(@PathVariable Integer id){
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }
    @GetMapping
    public ResponseEntity<?> getAllProduct(){
        List<Product> products = productService.getAllProduct();
        return ResponseEntity.ok(products);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Integer id , @RequestBody ProductRequest productRequest){
        Product product = productService.updateProduct(id,productRequest);
        return ResponseEntity.ok(product);
    }

}
