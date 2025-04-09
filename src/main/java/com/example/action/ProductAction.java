package com.example.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.pojo.entity.Product;
import com.example.service.ProductService;

@Controller
public class ProductAction {

    @Autowired
    private ProductService productService;

    private Product product;
    private List<Product> productList;

    // Getter / Setter for product
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // Getter / Setter for productList
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    // 後續會加入：add(), update(), delete(), findById(), findAll() 等方法
    // 新增商品
    public String add() {
        productService.save(product);
        return "success";
    }

    // 修改商品
    public String update() {
        productService.update(product);
        return "success";
    }

    // 刪除商品
    public String delete() {
        productService.delete(product);
        return "success";
    }

    // 查詢單一商品（根據 ID）
    public String findById() {
        product = productService.findById(product.getProd_id());
        return "success";
    }

    // 查詢所有商品
    public String findAll() {
        productList = productService.findAll();
        return "success";
    }

}
