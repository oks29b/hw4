package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.Employee;
import com.hw4.model.entity.Users;
import com.hw4.model.repository.EmployeeRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class EmployeeRepositoryImpl extends DefaultRepositoryImpl<Employee> implements EmployeeRepository {

    @Override
    public Employee findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Employee.class, id);
    }

    @Override
    public void remove(Integer id) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            Employee employee = session.get(Employee.class, id);
            session.delete(employee);
            transaction.commit();
        }catch (HibernateException e){
            System.out.println("Error: there is no such employee");
            transaction.rollback();
        }
    }

    @Override
    public List<Employee> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Employee");
        return query.getResultList();
    }
}
