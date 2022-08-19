package com.example.dentist.controller;

import com.example.dentist.domain.Dentist;
import com.example.dentist.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dentists")
public class DentistController {
    /** Attribute **/
    private final DentistService dentistService;

    /** Constructor **/
    @Autowired
    public DentistController(DentistService dentistService) {
        this.dentistService = dentistService;
    }

    /** Method **/
    @GetMapping
    public List<Dentist> getDentists() {
        return dentistService.dentistList();
    }
}
