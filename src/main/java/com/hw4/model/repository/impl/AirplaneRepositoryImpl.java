package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.Airplane;
import com.hw4.model.repository.AirplaneRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class AirplaneRepositoryImpl extends DefaultRepositoryImpl<Airplane> implements AirplaneRepository {

    @Override
    public Airplane findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Airplane.class, id);
    }

    @Override
    public void remove(Integer id) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            Airplane airplane = session.get(Airplane.class, id);
            session.delete(airplane);
            transaction.commit();
        }catch (HibernateException e){
            System.out.println("Error: there is no such airplane");
            transaction.rollback();
        }
    }

    @Override
    public List<Airplane> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from airplane");
        return query.getResultList();
    }
}
