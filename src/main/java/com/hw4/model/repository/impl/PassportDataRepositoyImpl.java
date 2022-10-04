package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.PassportData;
import com.hw4.model.repository.PassportDataRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class PassportDataRepositoyImpl extends DefaultRepositoryImpl<PassportData> implements PassportDataRepository {

    @Override
    public PassportData findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(PassportData.class, id);
    }

    @Override
    public void remove(Integer id) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            PassportData passportData = session.get(PassportData.class, id);
            session.delete(passportData);
            transaction.commit();
        }catch (HibernateException e){
            System.out.println("Error: there is no such passport");
            transaction.rollback();
        }
    }

    @Override
    public List<PassportData> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from passportData");
        return query.getResultList();
    }
}
