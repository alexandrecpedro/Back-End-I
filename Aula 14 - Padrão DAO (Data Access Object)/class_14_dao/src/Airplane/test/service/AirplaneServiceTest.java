package Airplane.test.service;

import Airplane.main.dao.SettingJDBC;
import Airplane.main.dao.impl.AirplaneDaoH2;
import Airplane.main.model.Airplane;
import Airplane.main.service.AirplaneService;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneServiceTest {
    /** Attribute **/
    AirplaneService airplaneService = new AirplaneService(new AirplaneDaoH2(new SettingJDBC()));

    @Test
    void insertTest() {
        Airplane airplane1 = new Airplane(1, "Boeing", "777-300ER", 1234, Date.valueOf("1996-03-28"));
        airplaneService.insert(airplane1);
        assertNotNull(airplaneService);
    }

    @Test
    void findByIdTest() {
        Airplane airplane1 = new Airplane(1, "Boeing", "777-300ER", 1234, Date.valueOf("1996-12-28"));
        Airplane airplane2 = new Airplane(2,"Airbus", "A340-300", 1023548, Date.valueOf("1980-06-28"));
        Airplane airplane3 = new Airplane(3,"Rocket", "Jet", 9996, Date.valueOf("2000-09-16"));
        Airplane airplane4 = new Airplane(4,"OVNI", " ", 5555, Date.valueOf("2010-11-05"));
        airplaneService.insert(airplane1);
        airplaneService.insert(airplane2);
        airplaneService.insert(airplane3);
        airplaneService.insert(airplane4);
        assertTrue(airplaneService.findById(2).getModel() == "A340-300");
    }

    @Test
    void deleteByIdTest() {
        Airplane airplane1 = new Airplane(1, "Boeing", "777-300ER", 1234, Date.valueOf("1996-03-28"));
        Airplane airplane2 = new Airplane(2,"Airbus", "A340-300", 1023548, Date.valueOf("28/03/1880"));
        Airplane airplane3 = new Airplane(3,"Rocket", "Jet", 9996, Date.valueOf("28/03/2000"));
        Airplane airplane4 = new Airplane(4,"OVNI", " ", 5555, Date.valueOf("28/03/2010"));
        airplaneService.insert(airplane1);
        airplaneService.insert(airplane2);
        airplaneService.insert(airplane3);
        airplaneService.insert(airplane4);
        airplaneService.deleteById(2);
        assertNull(airplaneService.findById(2));
    }

    @Test
    void findAllTest() {
        Airplane airplane1 = new Airplane(1, "Boeing", "777-300ER", 1234, Date.valueOf("1996-03-28"));
        airplaneService.insert(airplane1);

        List<Airplane> airplaneList = airplaneService.findAll();
        assertEquals(1, airplaneList.size());
    }
}