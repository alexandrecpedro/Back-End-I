package com.dh.medicine.dao;

public interface IDao<T> {
    T save(T t);
}
