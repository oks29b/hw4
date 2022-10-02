package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.Roles;
import com.hw4.model.repository.RolesRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class RolesRepositoryImpl extends DefaultRepositoryImpl<Roles> implements RolesRepository{

    public List<Roles> findAll(){
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from roles");
        return query.getResultList();
    }

    public Roles findById(Integer id){
        Session session = DataSource.getInstance().getSession();
        return session.get(Roles.class, id);
    }

    public void remove(Integer id){
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            Roles roles = session.get(Roles.class, id);
            session.delete(roles);
            transaction.commit();
        }catch (HibernateException e){
            System.out.println("Error: there is no such roles");
            transaction.rollback();
        }
    }
}
