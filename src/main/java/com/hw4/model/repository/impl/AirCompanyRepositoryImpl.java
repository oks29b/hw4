package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.AirCompany;
import com.hw4.model.repository.AirCompanyRepository;
import lombok.Data;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class AirCompanyRepositoryImpl extends DefaultRepositoryImpl<AirCompany> implements AirCompanyRepository {

    @Override
    public AirCompany findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(AirCompany.class, id);
    }

    @Override
    public void remove(Integer id) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            AirCompany airCompany = session.get(AirCompany.class, id);
            session.delete(airCompany);
            transaction.commit();
        }catch (HibernateException e){
            System.out.println("Error: there is no such aircompany");
            transaction.rollback();
        }
    }

    @Override
    public List<AirCompany> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from aircompany");
        return query.getResultList();
    }
}
