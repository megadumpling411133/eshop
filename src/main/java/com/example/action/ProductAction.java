package com.example.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.example.pojo.entity.Product;
import com.example.service.ProductService;

/**
 * 商品管理的 Action，負責處理前端請求。
 *
 * ✅ 加上 @Controller：讓 Spring 管理這個類別。
 * ✅ 加上 @Scope("prototype")：每個請求都建立新的 Action 實例（符合 Struts2 概念）。
 */
@Controller
@Scope("prototype")
public class ProductAction {

    @Autowired
    private ProductService productService; // ✅ Spring 自動注入 ProductService（從容器拿）

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
        System.out.println("✅ 進入 ProductAction.list()");

        try {
            productList = productService.getProducts();
            System.out.println("✅ 商品數量：" + (productList != null ? productList.size() : "null"));
        } catch (Exception e) {
            System.err.println("❌ 發生錯誤：" + e.getMessage());
            e.printStackTrace(); // ✅ 這行會把詳細錯誤印出到 Console
            return "error";
        }

        return "success";
    }

}
