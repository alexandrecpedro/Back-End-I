package Airplane.main.dao;

import Airplane.main.model.Airplane;

import java.sql.SQLException;
import java.util.List;

public interface IDao<T> {
    Airplane insert(T obj);
    void deleteById(Integer id);
    T findById(Integer id);
    List<T> findAll();
}
