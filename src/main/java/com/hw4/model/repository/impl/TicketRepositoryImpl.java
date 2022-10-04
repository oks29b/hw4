package com.hw4.model.repository.impl;

import com.hw4.model.DataSource;
import com.hw4.model.entity.Ticket;
import com.hw4.model.repository.TicketRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class TicketRepositoryImpl extends DefaultRepositoryImpl<Ticket> implements TicketRepository {

    @Override
    public Ticket findById(Integer id) {
        Session session = DataSource.getInstance().getSession();
        return session.get(Ticket.class, id);
    }

    @Override
    public void remove(Integer id) {
        Session session = DataSource.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            Ticket ticket = session.get(Ticket.class, id);
            transaction.commit();
        }catch (HibernateException e){
            System.out.println("Error: there is no such ticket");
            transaction.rollback();
        }
    }

    @Override
    public List<Ticket> findAll() {
        Session session = DataSource.getInstance().getSession();
        Query query = session.createQuery("from Ticket");
        return query.getResultList();
    }
}
