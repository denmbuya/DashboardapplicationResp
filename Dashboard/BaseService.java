package com.Dashboardapp.service;

import java.util.Optional;

public interface BaseService<T, ID> {
    T create(T entity);

    Optional<T> getById(ID id);

    Iterable<T> getAll();

    void update(ID id, T updatedEntity);

    void deleteById(ID id);
}
