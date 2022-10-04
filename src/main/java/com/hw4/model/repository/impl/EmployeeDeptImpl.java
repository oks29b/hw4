package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.EmployeeDepartments;
import com.hw4.model.entity.Users;
import com.hw4.model.repository.EmpolyeeDeptRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class EmployeeDeptImpl extends DefaultRepositoryImpl<EmployeeDepartments> implements EmpolyeeDeptRepository {

    @Override
    public EmployeeDepartments findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(EmployeeDepartments.class, id);
    }

    @Override
    public void remove(Integer id) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            EmployeeDepartments employeeDepartments = session.get(EmployeeDepartments.class, id);
            session.delete(employeeDepartments);
            transaction.commit();
        }catch (HibernateException e){
            System.out.println("Error: there is no such employeeDepartments");
            transaction.rollback();
        }
    }

    @Override
    public List<EmployeeDepartments> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from employeeDepartments");
        return query.getResultList();
    }
}
