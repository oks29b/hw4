package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.Route;
import com.hw4.model.repository.RouteRepository;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class RouteRepositoryImpl extends DefaultRepositoryImpl<Route> implements RouteRepository {

    @Override
    public Route findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Route.class, id);
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public List<Route> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from route");
        return query.getResultList();
    }
}
