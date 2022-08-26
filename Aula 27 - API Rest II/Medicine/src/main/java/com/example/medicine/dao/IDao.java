package com.example.medicine.dao;

public interface IDao<T> {
    /** Methods **/
    T save(T t);
    T findById(Integer id);
    T update(T t);
    void delete(Integer id);
}
