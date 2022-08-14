package Airplane.main.dao.impl;

import Airplane.main.dao.IDao;
import Airplane.main.model.Airplane;

import java.util.List;

public class AirplaneDaoInMemory implements IDao<Airplane> {
    /** Attributes **/
    private List<Airplane> airplaneRepository;

    /** Constructor **/
    public AirplaneDaoInMemory(List<Airplane> airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    /** Methods
     * @return**/
    @Override
    public Airplane insert(Airplane obj) {
        airplaneRepository.add(obj);
        return obj;
    }

    @Override
    public void deleteById(Integer id) {
        airplaneRepository.removeIf(airplane -> airplane.getId() == id);
    }

    @Override
    public Airplane findById(Integer id) {
        return airplaneRepository.stream().filter(airplane -> airplane.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Airplane> findAll() {
        return airplaneRepository;
    }
}
