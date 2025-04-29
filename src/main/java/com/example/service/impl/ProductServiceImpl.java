package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ProductDao;
import com.example.pojo.entity.Product;
import com.example.service.ProductService;

import java.util.List;

/**
 * 商品服務層實作
 */
@Service // ✅ 重點：一定要加！這樣 Spring 才能掃到這個 Bean
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void saveProducts(Product product) {
        productDao.save(product);
    }

    @Override
    public void updateProducts(Product product) {
        productDao.update(product);
    }

    @Override
    public void deleteProducts(Product product) {
        productDao.delete(product);
    }

    @Override
    public Product findById(Integer id) {
        return productDao.findById(id);
    }

    @Override
    public List<Product> getProducts() {
        return productDao.findAll();
    }
}
