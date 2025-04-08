package com.example.pojo.entity;


import java.util.Date;

/**
 * 購物車項目實體類別。
 */
public class CartItem {

    private String cart_id;
    private String cart_user_id;
    private String cart_product_id;
    private Integer cart_quantity;
    private Double cart_price;
    private Date cart_create_date;

    public String getCart_id() {
        return cart_id;
    }

    public void setCart_id(String cart_id) {
        this.cart_id = cart_id;
    }

    public String getCart_user_id() {
        return cart_user_id;
    }

    public void setCart_user_id(String cart_user_id) {
        this.cart_user_id = cart_user_id;
    }

    public String getCart_product_id() {
        return cart_product_id;
    }

    public void setCart_product_id(String cart_product_id) {
        this.cart_product_id = cart_product_id;
    }

    public Integer getCart_quantity() {
        return cart_quantity;
    }

    public void setCart_quantity(Integer cart_quantity) {
        this.cart_quantity = cart_quantity;
    }

    public Double getCart_price() {
        return cart_price;
    }

    public void setCart_price(Double cart_price) {
        this.cart_price = cart_price;
    }

    public Date getCart_create_date() {
        return cart_create_date;
    }

    public void setCart_create_date(Date cart_create_date) {
        this.cart_create_date = cart_create_date;
    }
}
