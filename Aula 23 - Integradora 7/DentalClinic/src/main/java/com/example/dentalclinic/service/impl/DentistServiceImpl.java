package com.example.dentalclinic.service.impl;

import com.example.dentalclinic.model.Dentist;
import com.example.dentalclinic.service.DentalClinicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DentistServiceImpl implements DentalClinicService<Dentist> {
    /** Attribute **/

    /** Constructor **/

    /** Methods **/
    @Override
    public Dentist save(Dentist dentist) {}

    @Override
    public Optional<Dentist> find(Integer id) {}

    @Override
    public List<Dentist> findAll() {}

    @Override
    public Dentist update(Dentist dentist) {
        return null;
    }

    @Override
    public void delete(Integer id) {
    }
}
