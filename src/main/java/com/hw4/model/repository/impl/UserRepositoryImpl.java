package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.Users;
import com.hw4.model.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class UserRepositoryImpl extends DefaultRepositoryImpl<Users> implements UserRepository{

    public List<Users> findAll(){
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from users");
        return query.getResultList();
    }

    public Users findById(Integer id){
        Session session = DataSource.getInstance().getSession();
        return session.get(Users.class, id);
    }

    public void remove(Integer id){
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Users user = session.get(Users.class, id);
        session.delete(user);
        transaction.commit();
    }
}
