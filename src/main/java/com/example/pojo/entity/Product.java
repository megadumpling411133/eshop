package com.example.pojo.entity;

import java.util.Date;

public class Product {

    private Integer prod_id;
    private String prod_name;
    private Double prod_price;
    private Integer prod_stock;
    private String prod_category;
    private String prod_category_id;
    private String prod_description;
    private String prod_image_url;
    private Integer prod_status;
    private Double prod_rating;
    private Integer prod_review_count;
    private Date prod_create_date;


    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }
    
    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public Double getProd_price() {
        return prod_price;
    }

    public void setProd_price(Double prod_price) {
        this.prod_price = prod_price;
    }

    public Integer getProd_stock() {
        return prod_stock;
    }

    public void setProd_stock(Integer prod_stock) {
        this.prod_stock = prod_stock;
    }

    public String getProd_category() {
        return prod_category;
    }

    public void setProd_category(String prod_category) {
        this.prod_category = prod_category;
    }

    public String getProd_category_id() {
        return prod_category_id;
    }

    public void setProd_category_id(String prod_category_id) {
        this.prod_category_id = prod_category_id;
    }

    public String getProd_description() {
        return prod_description;
    }

    public void setProd_description(String prod_description) {
        this.prod_description = prod_description;
    }

    public String getProd_image_url() {
        return prod_image_url;
    }

    public void setProd_image_url(String prod_image_url) {
        this.prod_image_url = prod_image_url;
    }

    public Integer getProd_status() {
        return prod_status;
    }

    public void setProd_status(Integer prod_status) {
        this.prod_status = prod_status;
    }

    public Double getProd_rating() {
        return prod_rating;
    }

    public void setProd_rating(Double prod_rating) {
        this.prod_rating = prod_rating;
    }

    public Integer getProd_review_count() {
        return prod_review_count;
    }

    public void setProd_review_count(Integer prod_review_count) {
        this.prod_review_count = prod_review_count;
    }

    public Date getProd_create_date() {
        return prod_create_date;
    }

    public void setProd_create_date(Date prod_create_date) {
        this.prod_create_date = prod_create_date;
    }
}
