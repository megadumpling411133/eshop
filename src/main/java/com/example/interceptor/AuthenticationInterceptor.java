package com.example.interceptor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.example.constant.ConstantName;
import com.example.pojo.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 驗證攔截器：僅攔截需要登入的 Action。
 */
public class AuthenticationInterceptor implements Interceptor {

    private static final long serialVersionUID = 1L;

    // ✅ 不需要驗證登入的 action 名單（根據 actionName 判斷）
    private static final Set<String> PUBLIC_ACTIONS = new HashSet<>(Arrays.asList(
            "login", "register", "save",        // 登入註冊流程
            "ProductList", "ProductDetail",     // 商品瀏覽
            "addToCart"                         // 未登入也能加進購物車
    ));

    @Override
    public void init() {
        // 初始化，如果有需要可以放設定
    }

    @Override
    public void destroy() {
        // 資源釋放，如果有需要可以做清理
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        String actionName = invocation.getProxy().getActionName();

        // ✅ 若 action 在白名單內 → 不檢查登入
        if (PUBLIC_ACTIONS.contains(actionName)) {
            return invocation.invoke();
        }

        // ❗ 其餘的需要登入驗證
        User user = getLoggedInUser();
        if (user != null && user.getLoginId() != null && !user.getLoginId().isEmpty()) {
            return invocation.invoke(); // ✅ 已登入 → 繼續
        }

        // ❌ 未登入 → 回傳 login，轉跳到登入頁
        return "login";
    }

    /**
     * 從 Session 中取得目前登入的使用者。
     */
    private User getLoggedInUser() {
        ActionContext ctx = ActionContext.getContext();
        Map<String, Object> session = ctx.getSession();
        return (User) session.get(ConstantName.SESSION_USER);
    }
}
