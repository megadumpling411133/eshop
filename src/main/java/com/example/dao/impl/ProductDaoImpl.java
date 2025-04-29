package com.example.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; // ✅ 要記得 import

import com.example.dao.ProductDao;
import com.example.pojo.entity.Product;

/**
 * 商品 DAO 實作類，負責與資料庫的互動。
 */
@Repository // ✅ 補上這個！讓 Spring 知道這是 DAO 層的 Bean
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Product product) {
        getCurrentSession().save(product);
    }

    @Override
    public void update(Product product) {
        getCurrentSession().update(product);
    }

    @Override
    public void delete(Product product) {
        getCurrentSession().delete(product);
    }

    @Override
    public Product findById(Integer id) {
        return getCurrentSession().get(Product.class, id);
    }

    @Override
    public List<Product> findAll() {
        String hql = "FROM Product";
        return getCurrentSession().createQuery(hql, Product.class).list();
    }
}
