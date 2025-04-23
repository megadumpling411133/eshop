package com.example.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.ProductDao;
import com.example.pojo.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Product product) {
        getSession().save(product);
    }

    @Override
    public void update(Product product) {
        getSession().update(product);
    }

    @Override
    public void delete(Product product) {
        getSession().delete(product);
    }

    @Override
    public Product findById(String id) {
        return getSession().get(Product.class, id);
    }

    @Override
    public List<Product> findAll() {
        String hql = "FROM Product";
        return getSession().createQuery(hql, Product.class).list();
    }
}
