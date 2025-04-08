package com.example.pojo.entity;

/**
 * 訂單明細項目實體類別。
 */
public class OrderItem {

    private String item_id;
    private String item_orders_id;
    private String item_product_id;
    private Integer item_quantity;
    private Double item_price;
    private Double item_subtotal;

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_orders_id() {
        return item_orders_id;
    }

    public void setItem_orders_id(String item_orders_id) {
        this.item_orders_id = item_orders_id;
    }

    public String getItem_product_id() {
        return item_product_id;
    }

    public void setItem_product_id(String item_product_id) {
        this.item_product_id = item_product_id;
    }

    public Integer getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(Integer item_quantity) {
        this.item_quantity = item_quantity;
    }

    public Double getItem_price() {
        return item_price;
    }

    public void setItem_price(Double item_price) {
        this.item_price = item_price;
    }

    public Double getItem_subtotal() {
        return item_subtotal;
    }

    public void setItem_subtotal(Double item_subtotal) {
        this.item_subtotal = item_subtotal;
    }
}
