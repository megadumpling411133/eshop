package com.example.service;

import java.util.List;
import com.example.pojo.entity.Product;

public interface ProductService {

    /**
     * 儲存商品
     */
    void saveProducts(Product product);

    /**
     * 更新商品
     */
    void updateProducts(Product product);

    /**
     * 刪除商品
     */
    void deleteProducts(Product product);

    /**
     * 根據 ID 查詢單一商品
     */
    Product findById(Integer id);

    /**
     * 查詢所有商品
     */
    List<Product> getProducts();
}
/*
 * package com.example.service;
 * 
 * import java.util.List;
 * 
 * import com.example.pojo.entity.Product;
 * 
 * public interface ProductService { void saveProducts(Product product); void
 * updateProducts(Product product); void deleteProducts(Product product);
 * Product findById(String id); List<Product> getProducts(); }
 */