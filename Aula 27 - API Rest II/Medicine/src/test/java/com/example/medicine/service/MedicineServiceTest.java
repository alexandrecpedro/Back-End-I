package com.example.medicine.service;

import com.example.medicine.dao.SettingJDBC;
import com.example.medicine.dao.impl.MedicineDaoImpl;
import com.example.medicine.model.Medicine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicineServiceTest {
    /** Attribute **/
    private MedicineService medicineService = new MedicineService(new MedicineDaoImpl(new SettingJDBC()));

    /** Test **/
    @Test
    void saveMedicineTest() {
        Medicine medicine = new Medicine("Ibuprofeno", "Aché", 395, 23.0);
        medicineService.save(medicine);
        assertNotNull(medicine.getId());
    }
}