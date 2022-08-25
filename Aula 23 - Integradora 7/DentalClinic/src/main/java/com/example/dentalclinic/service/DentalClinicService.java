package com.example.dentalclinic.service;

import java.util.List;
import java.util.Optional;

public interface DentalClinicService<T> {
    /** Methods **/
    T save(T t);
    List<T> findAll();
    String delete(Integer id);
}
