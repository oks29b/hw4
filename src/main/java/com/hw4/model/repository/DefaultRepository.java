package com.hw4.model.repository;

import java.util.List;

public interface DefaultRepository<T> {
    void save(T entity);
    T findById(Integer id);

    void remove(Integer id);

    List<T> findAll();

}
