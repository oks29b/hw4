package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.Departments;
import com.hw4.model.repository.DepartmentsRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class DepartmentsRepositoryImpl extends DefaultRepositoryImpl<Departments> implements DepartmentsRepository {

    @Override
    public Departments findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        session.get(Departments.class, id);
        return session.get(Departments.class, id);
    }

    @Override
    public void remove(Integer id) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            Departments departments = session.get(Departments.class, id);
            session.delete(departments);
            transaction.commit();
        }catch (HibernateException e){
            System.out.println("Error: there is no such departments");
            transaction.rollback();
        }
    }

    @Override
    public List<Departments> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from departments");
        return query.getResultList();
    }
}
