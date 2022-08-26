package com.example.medicine.controller;

import com.example.medicine.dao.SettingJDBC;
import com.example.medicine.dao.impl.MedicineDaoImpl;
import com.example.medicine.model.Medicine;
import com.example.medicine.service.MedicineService;
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
}
