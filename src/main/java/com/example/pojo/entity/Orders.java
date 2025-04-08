package com.example.pojo.entity;

import java.util.Date;

/**
 * 訂單主檔實體類別。
 */
public class Orders {

    private String orders_id;
    private String orders_user_id;
    private Integer orders_status;      // 0: 待付款, 1: 已付款, 2: 已出貨
    private Double orders_total;
    private Date orders_create_date;

    public String getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(String orders_id) {
        this.orders_id = orders_id;
    }

    public String getOrders_user_id() {
        return orders_user_id;
    }

    public void setOrders_user_id(String orders_user_id) {
        this.orders_user_id = orders_user_id;
    }

    public Integer getOrders_status() {
        return orders_status;
    }

    public void setOrders_status(Integer orders_status) {
        this.orders_status = orders_status;
    }

    public Double getOrders_total() {
        return orders_total;
    }

    public void setOrders_total(Double orders_total) {
        this.orders_total = orders_total;
    }

    public Date getOrders_create_date() {
        return orders_create_date;
    }

    public void setOrders_create_date(Date orders_create_date) {
        this.orders_create_date = orders_create_date;
    }
}
