package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.ProductDao;
import com.example.pojo.entity.Product;
import com.example.service.ProductService;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao; // 用 @Autowired 自動注入

    public ProductDao getProductDao() {
        return productDao;
    }

    @Autowired
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

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
/*
 * package com.example.service.impl;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.example.dao.ProductDao; import com.example.pojo.entity.Product;
 * import com.example.service.ProductService;
 * 
 * @Service
 * 
 * @Transactional public class ProductServiceImpl implements ProductService {
 * 
 * 這裡注入 ProductDao
 * 
 * @Autowired private ProductDao productDao;
 * 
 * @Override public void save(Product product) { productDao.save(product); }
 * 
 * @Override public void update(Product product) { productDao.update(product); }
 * 
 * @Override public void delete(Product product) { productDao.delete(product); }
 * 
 * @Override public Product findById(String id) { return
 * productDao.findById(id); }
 * 
 * @Override public List<Product> findAll() { return productDao.findAll(); } }
 */