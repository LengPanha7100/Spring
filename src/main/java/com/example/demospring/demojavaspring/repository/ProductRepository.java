package com.example.demospring.demojavaspring.repository;

import com.example.demospring.demojavaspring.model.Product;
import com.example.demospring.demojavaspring.model.ProductRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductRepository {
    @Select("""
    insert into product (proName, qty)
    values (#{proName},#{qty})
    returning *;
    """)
    Product createCustomer(ProductRepository productRepository);
    @Select("""
    SELECT * FROM product where id =#{id};
    """)
    Product getProductById(Integer id);
    @Select("""
    SELECT * FROM product;
    """)
    List<Product> getAllProduct();
    @Select("""
    UPDATE product
    set proName = #{product.proName},qty = #{product.qty} where id =#{id};
    """)
    Product updateProduct(Integer id, @Param("product") ProductRequest productRequest);
}
