package Airplane;

import Airplane.main.dao.SettingJDBC;
import Airplane.main.dao.impl.AirplaneDaoH2;
import Airplane.main.model.Airplane;
import Airplane.main.service.AirplaneService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestH2Dao {
    public static void main(String[] args) throws ParseException {
        /** Data Conversion **/
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        /** Attributes **/
        AirplaneService airplaneService = new AirplaneService(new AirplaneDaoH2(new SettingJDBC()));

        Airplane airplane1 = new Airplane(1, "Boeing", "777-300ER", 1234, sdf.parse("28/03/1996"));
        Airplane airplane2 = new Airplane(2,"Airbus", "A340-300", 1023548, sdf.parse("28/03/1880"));
        Airplane airplane3 = new Airplane(3,"Rocket", "Jet", 9996, sdf.parse("28/03/2000"));
        Airplane airplane4 = new Airplane(4,"OVNI", " ", 5555, sdf.parse("28/03/2010"));

        /** Methods **/
        // Saving Data (INSERT)
        System.out.println("Saving data at AirplaneService");
        airplaneService.insert(airplane1);
        airplaneService.insert(airplane2);
        airplaneService.insert(airplane3);
        airplaneService.insert(airplane4);

        // Find Data by ID (FIND BY ID)
        System.out.println("\n====== Find data by ID ======");
        System.out.println(airplaneService.findById(1));

        // Remove Data (DELETE)
        System.out.println("\n====== Delete data by ID ======");
        System.out.println("Delete ID 3");
        airplaneService.deleteById(3);

        // Find all Data (FIND ALL)
        System.out.println("\n====== Find all data ======");
        airplaneService.findAll().forEach(System.out::println);
    }
}
