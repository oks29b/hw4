package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.City;
import com.hw4.model.repository.CityRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.Query;
import java.util.List;

public class CityRepositoryImpl extends DefaultRepositoryImpl<City> implements CityRepository {

    @Override
    public City findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(City.class, id);
    }

    @Override
    public void remove(Integer id) {
        Session session =DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            City city = session.get(City.class, id);
            session.delete(city);
            transaction.commit();
        }catch (HibernateException e){
            System.out.println("Error: there is no such city");
            transaction.rollback();
        }
    }

    @Override
    public List<City> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from city");
        return query.getResultList();
    }
}
