package Pharmacy.tests;

import Pharmacy.medicine.Main;
import Pharmacy.medicine.dao.SettingJDBC;
import Pharmacy.medicine.dao.impl.MedicineDaoH2;
import Pharmacy.medicine.model.Medicine;
import Pharmacy.medicine.service.MedicineService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MedicineServiceTest {
    /** Attributes **/
    private static final org.apache.log4j.Logger logger = Logger.getLogger(Main.class);
    private MedicineService medicineService = new MedicineService(new MedicineDaoH2(new SettingJDBC()));

    Medicine medicine1 = new Medicine("Tylenol", "JANSSEN-CILAG",
            10, 23.87);
    Medicine medicine2 = new Medicine("Resfenol", "KLEY-HERTZ",
            20, 18.57);
    Medicine medicine3 = new Medicine("Doril", "HYPERA PHARMA",
            4, 9.13);

    @Test
    void save() {
        Medicine tylenol = medicineService.save(medicine1);
        assertNotNull(tylenol.getId());
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
        medicineService.save(medicine1);
        medicineService.save(medicine2);
        medicineService.save(medicine3);

        List<Medicine> medicineList = medicineService.findAll();
        assertEquals(3, medicineList.size());
    }

    @Test
    void deleteById() {
    }

    @Test
    void update() {

    }
}