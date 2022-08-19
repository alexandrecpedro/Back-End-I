package com.example.dentist.service.impl;

import com.example.dentist.domain.Dentist;
import com.example.dentist.service.DentistService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DentistServiceImpl implements DentistService {
    /** Method **/
    @Override
    public List<Dentist> dentistList() {
        return Arrays.asList(new Dentist("Mary"), new Dentist("John"));
    }
}
