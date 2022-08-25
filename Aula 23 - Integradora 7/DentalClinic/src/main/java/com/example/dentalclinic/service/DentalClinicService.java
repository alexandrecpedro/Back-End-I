package com.example.dentalclinic.service;

import com.example.dentalclinic.model.User;

import java.util.List;
import java.util.Optional;

public interface DentalClinicService<T> {
    /** Methods **/
    T save(T t);
    Optional<T> find(Integer id);
    List<T> findAll();
    T update(T t);
    void delete(Integer id);
}
