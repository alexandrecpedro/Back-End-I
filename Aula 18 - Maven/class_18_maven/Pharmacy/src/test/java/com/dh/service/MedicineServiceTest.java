package com.dh.service;

import com.dh.medicine.dao.SettingJDBC;
import com.dh.medicine.dao.impl.MedicineDaoImpl;
import com.dh.medicine.model.Medicine;
import com.dh.medicine.service.MedicineService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MedicineServiceTest {
    /** Attributes **/
    private MedicineService medicineService = new MedicineService(new MedicineDaoImpl(new SettingJDBC()));

    @Test
    void saveMedicineTest() {
        Medicine medicine = new Medicine("Ibuprofeno", "Aché", 395, 23.0);
        medicineService.save(medicine);
        assertNotNull(medicine.getId());
    }
}