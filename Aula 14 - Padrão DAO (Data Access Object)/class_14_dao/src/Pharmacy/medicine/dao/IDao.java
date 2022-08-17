package Pharmacy.medicine.dao;

public interface IDao<T> {
    T save(T t);
}
