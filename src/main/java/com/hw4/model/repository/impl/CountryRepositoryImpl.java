package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.Country;
import com.hw4.model.repository.CountryRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class CountryRepositoryImpl extends DefaultRepositoryImpl<Country> implements CountryRepository{

    public List<Country> findAll(){
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from country");
        return query.getResultList();
    }

    public Country findById(Integer id){
        Session session = DataSource.getInstance().getSession();
        return session.get(Country.class, id);
    }

    public void remove(Integer id){
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            Country country = session.get(Country.class, id);
            session.delete(country);
            transaction.commit();
        }catch (HibernateException e){
            System.out.println("Error: there is no such country");
            transaction.rollback();
        }
    }
}
