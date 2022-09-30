package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.repository.DefaultRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DefaultRepositoryImpl<T> implements DefaultRepository<T> {
    @Override
    public void save(T entity) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T findById(Integer id) {
        return null;
    }


}
