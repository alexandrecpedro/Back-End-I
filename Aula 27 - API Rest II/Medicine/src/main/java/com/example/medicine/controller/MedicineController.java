package com.example.medicine.controller;

import com.example.medicine.dao.SettingJDBC;
import com.example.medicine.dao.impl.MedicineDaoImpl;
import com.example.medicine.model.Medicine;
import com.example.medicine.service.MedicineService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicines")
public class MedicineController {
    /** Attribute **/
    private MedicineService medicineService = new MedicineService(
            new MedicineDaoImpl(new SettingJDBC())
    );

    /** Methods **/
    @PostMapping("/save")
    public Medicine save(@RequestBody Medicine medicine) {
        return medicineService.save(medicine);
    }

    @GetMapping("/{id}")
    public Medicine findById(@PathVariable Integer id) {
        return medicineService.findById(id);
    }

    @PutMapping("/update")
    public ResponseEntity<Medicine> update(@RequestBody Medicine medicine) {
        return (medicineService.findById(medicine.getId()).equals(null)) ?
                new ResponseEntity(HttpStatus.NOT_FOUND)
                : ResponseEntity.ok(medicineService.update(medicine));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        if (medicineService.findById(id).equals(null)) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        } else {
            medicineService.delete(id);
            return ResponseEntity.noContent().build();
        }
    }
}
