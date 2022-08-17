package Pharmacy.tests;

import Pharmacy.medicine.dao.SettingJDBC;
import Pharmacy.medicine.dao.impl.MedicineDaoImpl;
import Pharmacy.medicine.model.Medicine;
import Pharmacy.medicine.service.MedicineService;
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