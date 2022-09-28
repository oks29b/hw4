package com.hw4.model;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Session;

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
