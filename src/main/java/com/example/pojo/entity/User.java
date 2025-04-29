package com.example.pojo.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user") // ✅ 對應資料表名稱
public class User {

    @Id
    @Column(name = "user_id")
    private String user_id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "loginId")
    private String loginId;

    @Column(name = "password")
    private String password;

    @Column(name = "tel")
    private String tel;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdate")
    private Date createDate;
    // 取得使用者的 ID
    public String getUser_id() {
        return user_id;
    }

    // 設定使用者的 ID
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    // 取得使用者名稱
    public String getUser_name() {
        return user_name;
    }

    // 設定使用者名稱
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    // 取得使用者的登入帳號
    public String getLoginId() {
        return loginId;
    }

    // 設定使用者的登入帳號
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    // 取得使用者的密碼
    public String getPassword() {
        return password;
    }

    // 設定使用者的密碼
    public void setPassword(String password) {
        this.password = password;
    }

    // 取得使用者的電話號碼
    public String getTel() {
        return tel;
    }

    // 設定使用者的電話號碼
    public void setTel(String tel) {
        this.tel = tel;
    }

    // 取得使用者的註冊日期
    public Date getCreateDate() {
        return createDate;
    }

    // 設定使用者的註冊日期
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
}
