package com.dh.subjects.dao;

import java.util.List;
public interface IDao <T> {
    T save(T t);

    List<T> findAll();
}
