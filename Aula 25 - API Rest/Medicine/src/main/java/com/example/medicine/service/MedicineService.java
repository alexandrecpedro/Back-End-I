package com.example.medicine.service;

import com.example.medicine.dao.IDao;
import com.example.medicine.model.Medicine;


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

    public Medicine findById(Integer id) {
        return medicineIDao.findById(id);
    }
}
