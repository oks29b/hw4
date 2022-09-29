package com.hw4.model.repository;

import com.hw4.model.DataSource;
import com.hw4.model.entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public interface UserRepository {
    public void save(Users user);

    public List<Users> findAll();

    public Users findById(Integer id);

    public void removeById(Integer id);
}
