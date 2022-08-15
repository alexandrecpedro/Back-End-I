package Airplane.main.service;

import Airplane.main.dao.IDao;
import Airplane.main.model.Airplane;

import java.util.List;

public class AirplaneService {
    /** Attribute **/
    private IDao<Airplane> airplaneIDao;

    /** Constructor **/
    public AirplaneService(IDao<Airplane> airplaneIDao) {
        this.airplaneIDao = airplaneIDao;
    }

    /** Methods **/
    public void insert(Airplane airplane) {
        airplaneIDao.insert(airplane);
    }

    public Airplane findById(Integer id) {
        return airplaneIDao.findById(id);
    }

    public void deleteById(Integer id) {
        airplaneIDao.deleteById(id);
    }

    public List<Airplane> findAll() {
        return airplaneIDao.findAll();
    }
}
