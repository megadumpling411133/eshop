package com.example.pojo.entity;

import java.util.Date;

/**
 * 商品評論實體類別。
 */
public class Review {

    private String rev_id;
    private String rev_user_id;
    private String rev_product_id;
    private Integer rev_rating;
    private String rev_comment;
    private Date rev_create_date;

    public String getRev_id() {
        return rev_id;
    }

    public void setRev_id(String rev_id) {
        this.rev_id = rev_id;
    }

    public String getRev_user_id() {
        return rev_user_id;
    }

    public void setRev_user_id(String rev_user_id) {
        this.rev_user_id = rev_user_id;
    }

    public String getRev_product_id() {
        return rev_product_id;
    }

    public void setRev_product_id(String rev_product_id) {
        this.rev_product_id = rev_product_id;
    }

    public Integer getRev_rating() {
        return rev_rating;
    }

    public void setRev_rating(Integer rev_rating) {
        this.rev_rating = rev_rating;
    }

    public String getRev_comment() {
        return rev_comment;
    }

    public void setRev_comment(String rev_comment) {
        this.rev_comment = rev_comment;
    }

    public Date getRev_create_date() {
        return rev_create_date;
    }

    public void setRev_create_date(Date rev_create_date) {
        this.rev_create_date = rev_create_date;
    }
}
