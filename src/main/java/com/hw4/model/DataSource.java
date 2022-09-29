package com.hw4.model;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataSource {

        private static DataSource dataSource=new DataSource();
        private static EntityManagerFactory entityManagerFactory;
        private ComboPooledDataSource pooledDataSource;

        public static DataSource getInstance(){
            return dataSource;
        }

        private DataSource(){
           entityManagerFactory = Persistence.createEntityManagerFactory("com.hw4");
        }

        public EntityManager getEntityManager(){
            return entityManagerFactory.createEntityManager();
        }

        public Session getSession(){
            return getEntityManager().unwrap(Session.class);
        }
}
