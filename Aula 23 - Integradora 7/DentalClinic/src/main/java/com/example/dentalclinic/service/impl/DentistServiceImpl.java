package com.example.dentalclinic.service.impl;

import com.example.dentalclinic.model.Dentist;
import com.example.dentalclinic.service.DentalClinicService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DentistServiceImpl implements DentalClinicService<Dentist> {
    /** Attribute **/
    private static Map<Integer, Dentist> dentistMap = new HashMap<>();

    /** Methods **/
    @Override
    public Dentist save(Dentist dentist) {
        dentistMap.put(dentist.getId(), dentist);
        return dentist;
    }

    @Override
    public List<Dentist> findAll() {
        return new ArrayList<>(dentistMap.values());
    }

    @Override
    public String delete(Integer id) {
        dentistMap.remove(id);
        return "Deleted dentist";
    }
}
