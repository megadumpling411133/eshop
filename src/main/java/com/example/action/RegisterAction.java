package com.example.action;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.pojo.entity.User;
import com.example.service.UserService;
import com.example.constant.ConstantName;

public class RegisterAction extends BaseAction {

    private static final long serialVersionUID = 1L;

    private User user;

    @Autowired
    private UserService userService;

    /**
     * 使用模型驅動來封裝 User 物件
     * @return 返回 User 物件
     */
    @Override
    public User getModel() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    /**
     * 跳轉至註冊頁面
     * @return 返回註冊頁面
     */
    public String register() {
    	System.out.println("F___RegisterAction.register() 被執行了！");
        return INPUT;
    }
    
    /**
     * 處理註冊邏輯
     * @return 註冊成功返回 SUCCESS，失敗返回 INPUT
     */
    public String save() {
    	System.out.println("G___RegisterAction.save() 被執行了");
        // 註冊資料儲存前的資料檢查
        

        try {
        	if (!doCheck(user)) {
            	System.out.println("A___RegisterAction.save() 被執行了 : !doCheck(user) ");
    			return INPUT;

            }else {
            	// 設置註冊時間
            	System.out.println("");
                setUserCreateDate(user);

                // 呼叫 UserService 來保存使用者資料
                userService.addUser(user);

                // 註冊成功，將訊息設置到 session
                getSession().setAttribute(ConstantName.SESSION_USER_MSG, "註冊成功，請登入");
            	
            }
            
        } catch (Exception e) {
            // 註冊失敗，將錯誤訊息設置到 session
        	System.out.println("");
            getSession().setAttribute(ConstantName.SESSION_USER_MSG, "註冊失敗，請重試");
            return INPUT;
        }

        return SUCCESS;
    }

    /**
     * 註冊前資料檢查，這裡可以擴展更多檢查邏輯
     * @param user 註冊的使用者資料
     * @return 若檢查通過返回 true，否則返回 false
     */
    private boolean doCheck(User user) {
        // 檢查帳號、密碼格式、是否已經存在等邏輯可以放在這裡
        // 比如，可以在這裡加上檢查帳號是否已經被註冊
    	System.out.println("B___RegisterAction.doCheck() 被執行了");
    	System.out.println();
        return user != null && user.getLoginId() != null && !user.getLoginId().isEmpty();
    }

    /**
     * 設置使用者的創建日期
     * @param user 使用者資料
     */
    private void setUserCreateDate(User user) {
    	System.out.println("C___RegisterAction.setUserCreateDate() 被執行了");
        user.setCreateDate(new Date());
    }

    // Getter and Setter
    public User getUser() {
    	System.out.println("D___RegisterAction.getUser() 被執行了");
        return user;
    }

    public void setUser(User user) {
    	System.out.println("E___RegisterAction.setUser(User user) 被執行了");
        this.user = user;
    }
}
