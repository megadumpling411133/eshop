package com.example.service;

import java.util.List;

import com.example.pojo.entity.Product;

public interface ProductService {
    void save(Product product);
    void update(Product product);
    void delete(Product product);
    Product findById(String id);
    List<Product> findAll();
}
