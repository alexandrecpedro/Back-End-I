package Pharmacy.medicine.dao;

import java.util.List;

public interface IDao<T> {
    T save(T t);
    T findById(Long id);
    List<T> findAll();
    void deleteById(Long id);
    void update(T t);
}
