package com.example.dao;

import com.example.pojo.entity.Product;
import java.util.List;

/* ProductDao 只是界面
 * 實作是另外分開的 ProductDaoImpl
 * 
 * 為什麼要分開實作：
 * 程式設計中的「高內聚、低耦合」與「依賴反轉原則（DIP）
 * 「插頭（interface）是統一規格，而插座（impl）可以多種變化。
 * 只要插頭規格對，家電就能用不同插座。 」
 * 
 * 1.
 * 抽象化好處：不依賴具體實作
 * ProductDao 是介面，代表一組操作「規格」。
 * ProductDaoImpl 是實際操作資料庫的實作。
 * 上層（例如 Service）只需要依賴 ProductDao，不需知道裡面是用 Hibernate、JDBC、MyBatis 還是 MongoDB。
 * 2.
 * 可替換性與彈性（開放封閉原則）
 * 將來如果不想用 Hibernate，要改用 MyBatis，
 * 只要新寫一個 ProductDaoImplWithMyBatis，不用改 Service。
 * 不需要動用業務邏輯層，就能替換實作方式。
 * 
 * 3.
 * 易於單元測試（Mock）
 * 在測試 ProductService 時，只要模擬 ProductDao 的行為（Mock Interface），就不需要真正連到資料庫。
 * 這對寫測試、自動化非常重要。
 * 4.
 * Spring 可以透過 @Autowired 自動將 ProductDaoImpl 注入到 ProductDao 的介面變數。
 * 這是依賴注入（DI）常見寫法，讓程式碼更鬆耦合、更好管理。
 * */
public interface ProductDao {
    void save(Product product);
    void update(Product product);
    void delete(Product product);
    Product findById(String id);
    List<Product> findAll();
}
