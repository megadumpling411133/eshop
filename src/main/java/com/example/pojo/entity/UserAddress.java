package com.example.pojo.entity;

/**
 * 使用者收貨地址實體類別。
 */
public class UserAddress {

    private String addr_id;
    private String addr_user_id;
    private String addr_name;
    private String addr_tel;
    private String addr_city;
    private String addr_detail;
    private String addr_zipcode;
    private Boolean addr_default;

    public String getAddr_id() {
        return addr_id;
    }

    public void setAddr_id(String addr_id) {
        this.addr_id = addr_id;
    }

    public String getAddr_user_id() {
        return addr_user_id;
    }

    public void setAddr_user_id(String addr_user_id) {
        this.addr_user_id = addr_user_id;
    }

    public String getAddr_name() {
        return addr_name;
    }

    public void setAddr_name(String addr_name) {
        this.addr_name = addr_name;
    }

    public String getAddr_tel() {
        return addr_tel;
    }

    public void setAddr_tel(String addr_tel) {
        this.addr_tel = addr_tel;
    }

    public String getAddr_city() {
        return addr_city;
    }

    public void setAddr_city(String addr_city) {
        this.addr_city = addr_city;
    }

    public String getAddr_detail() {
        return addr_detail;
    }

    public void setAddr_detail(String addr_detail) {
        this.addr_detail = addr_detail;
    }

    public String getAddr_zipcode() {
        return addr_zipcode;
    }

    public void setAddr_zipcode(String addr_zipcode) {
        this.addr_zipcode = addr_zipcode;
    }

    public Boolean getAddr_default() {
        return addr_default;
    }

    public void setAddr_default(Boolean addr_default) {
        this.addr_default = addr_default;
    }
}
