package cn.ice.lab.service;

import java.util.List;

public interface IBaseService<T, ID> {
    T findOne(ID id);
    List<T> findAll();
    T save(T entity);
    T update(T entity);
    void delete(ID id);
}
