package Airplane.main.service;

import Airplane.main.dao.IDao;
import Airplane.main.model.Airplane;

import java.sql.SQLException;
import java.util.List;

public class AirplaneService {
    /** Attribute **/
    private IDao<Airplane> airplaneIDao;

    /** Constructor **/
    public AirplaneService(IDao<Airplane> airplaneIDao) {
        this.airplaneIDao = airplaneIDao;
    }

    /** Methods **/
    public Airplane insert(Airplane airplane) {
        return airplaneIDao.insert(airplane);
    }

    public void findById(Integer id) throws SQLException {
        airplaneIDao.findById(id);
    }

    public void deleteById(Integer id) throws SQLException {
        airplaneIDao.deleteById(id);
    }

    public List<Airplane> findAll() throws SQLException {
        return airplaneIDao.findAll();
    }
}
