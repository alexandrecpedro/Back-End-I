package com.dh.medicine.service;

import com.dh.medicine.dao.IDao;
import com.dh.medicine.model.Medicine;

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
