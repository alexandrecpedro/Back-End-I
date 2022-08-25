package com.example.dentalclinic.controller;

import com.example.dentalclinic.model.Dentist;
import com.example.dentalclinic.model.User;
import com.example.dentalclinic.service.impl.DentistServiceImpl;
import com.example.dentalclinic.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentists")
public class DentistController {
    /** Attribute **/
    @Autowired
    private DentistServiceImpl dentistService;

    /** Methods **/
    @PostMapping
    public ResponseEntity<Dentist> save(@RequestBody Dentist dentist) {
        return ResponseEntity.ok(dentistService.save(dentist));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dentist> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(dentistService.find(id).orElse(null));
    }

    @GetMapping
    public ResponseEntity<List<Dentist>> findAll() {
        return ResponseEntity.ok(dentistService.findAll());
    }

    @PutMapping
    public ResponseEntity<Dentist> update(@RequestBody Dentist dentist) {
        return ((!dentist.getId().equals(null)) && dentistService.find(dentist.getId()).isPresent()) ?
                ResponseEntity.ok(dentistService.save(dentist)) :
                ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        if (dentistService.find(id).isPresent()) {
            dentistService.delete(id);
            return ResponseEntity.ok("Successfully deleted");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
