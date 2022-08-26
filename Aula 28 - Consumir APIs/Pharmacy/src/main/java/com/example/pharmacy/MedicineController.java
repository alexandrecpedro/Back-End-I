package com.example.pharmacy;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class MedicineController {
    /** **/
    private MedicineClient medicineClient = new MedicineClient();

    /** Methods **/
    @PostMapping("/save")
    public Medicine save(@RequestBody Medicine medicine) {
        return medicineClient.save(medicine);
    }

    @GetMapping("/{id}")
    public Medicine findById(@PathVariable Integer id) {
        return medicineClient.findById(id);
    }

    @PutMapping("/update")
    public Medicine update(@RequestBody Medicine medicine) {
        return medicineClient.update(medicine);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        return medicineClient.delete(id);
    }
}
