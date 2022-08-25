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

    @GetMapping("/search")
    public ResponseEntity<List<Dentist>> findAll() {
        return ResponseEntity.ok(dentistService.findAll());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        if (!dentistService.findAll().stream().filter(user -> user.getId() == id).equals(null)) {
            dentistService.delete(id);
            return ResponseEntity.ok("Successfully deleted");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
