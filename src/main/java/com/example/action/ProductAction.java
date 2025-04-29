package com.example.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.pojo.entity.Product;
import com.example.service.ProductService;

public class ProductAction {

    @Autowired
    private ProductService productService; // ✅ 可以用 @Autowired 自動注入（由 Spring 管 XML）

    private Product product;
    private List<Product> productList;

    // ====== Getter / Setter ======

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public ProductService getProductService() {
        return productService;
    }

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    // ====== Action Methods ======

    /**
     * 新增商品
     */
    public String add() {
        productService.saveProducts(product);
        return "success";
    }

    /**
     * 修改商品
     */
    public String update() {
        productService.updateProducts(product);
        return "success";
    }

    /**
     * 刪除商品
     */
    public String delete() {
        productService.deleteProducts(product);
        return "success";
    }

    /**
     * 查詢單一商品（根據 ID）
     */
    public String findById() {
        if (product != null && product.getProd_id() != null) {
            product = productService.findById(product.getProd_id());
        }
        return "success";
    }

    /**
     * 查詢所有商品
     */
    public String list() {
        productList = productService.getProducts();
        return "success";
    }
}

/*
 * package com.example.action;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller;
 * 
 * import com.example.pojo.entity.Product; import
 * com.example.service.ProductService;
 * 
 * @Controller public class ProductAction {
 * 
 * @Autowired private ProductService productService;
 * 
 * private Product product; private List<Product> productList;
 * 
 * 
 * // Getter / Setter for product public Product getProduct() { return product;
 * }
 * 
 * public void setProduct(Product product) { this.product = product; }
 * 
 * // Getter / Setter for productList public List<Product> getProductList() {
 * return productList; }
 * 
 * public void setProductList(List<Product> productList) { this.productList =
 * productList; }
 * 
 * // 新增商品 public String add() { productService.saveProducts(product); return
 * "success"; }
 * 
 * // 修改商品 public String updateProducts() {
 * productService.updateProducts(product); return "success"; }
 * 
 * // 刪除商品 public String deleteProducts() {
 * productService.deleteProducts(product); return "success"; }
 * 
 * // 查詢單一商品（根據 ID） public String findById() { product =
 * productService.findById(product.getProd_id()); return "success"; }
 * 
 * // 查詢所有商品 // public String findAll() { // productList =
 * productService.findAll(); // return "success"; // }
 * 
 * // 查詢所有商品 public String getProducts() { productList =
 * productService.getProducts(); return "success"; } }
 */