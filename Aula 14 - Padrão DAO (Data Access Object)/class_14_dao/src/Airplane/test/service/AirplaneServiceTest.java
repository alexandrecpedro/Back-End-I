package Airplane.test.service;

import Airplane.main.dao.SettingJDBC;
import Airplane.main.dao.impl.AirplaneDaoH2;
import Airplane.main.model.Airplane;
import Airplane.main.service.AirplaneService;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneServiceTest {
    /** Data Format **/
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    AirplaneService airplaneService = new AirplaneService(new AirplaneDaoH2(new SettingJDBC()));
    List<Airplane> airplaneList = null;

    @BeforeClass
    void addTest() throws ParseException {
        Airplane airplane1 = new Airplane(1, "Boeing", "777-300ER", 1234, sdf.parse("28/03/1996"));
        Airplane airplane2 = new Airplane(2,"Airbus", "A340-300", 1023548, sdf.parse("28/03/1880"));
        Airplane airplane3 = new Airplane(3,"Rocket", "Jet", 9996, sdf.parse("28/03/2000"));
        Airplane airplane4 = new Airplane(4,"OVNI", " ", 5555, sdf.parse("28/03/2010"));
        airplaneList.add(airplane1);
        airplaneList.add(airplane2);
        airplaneList.add(airplane3);
        airplaneList.add(airplane4);
    }


    @Test
    void insertTest() {
        assertNotNull(airplaneList.size());
    }

    @Test
    void findById() {
        assertEquals("A340-300", airplaneList.stream()
                .filter(airplane -> airplane.getBrand().equals("Airbus")));
    }

    @Test
    void deleteById() {
        airplaneList.remove(2);
        assertEquals(null, airplaneList.stream()
                .filter(airplane -> airplane.getModel().equals("Jet")));
    }

    @Test
    void findAll() {
    }
}