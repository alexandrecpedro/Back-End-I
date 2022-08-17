package Pharmacy.medicine.service;

import Pharmacy.medicine.dao.IDao;
import Pharmacy.medicine.model.Medicine;

import java.util.List;

public class MedicineService {
    /** Attribute **/
    private IDao<Medicine> medicineIDao;

    /** Constructor **/
    public MedicineService(IDao<Medicine> medicineIDao) {
        this.medicineIDao = medicineIDao;
    }

    /** Methods **/
    public Medicine save(Medicine medicine) {
        return medicineIDao.save(medicine);
    }
}
