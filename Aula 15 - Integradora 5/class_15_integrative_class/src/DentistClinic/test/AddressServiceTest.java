package DentistClinic.test;

import DentistClinic.dao.SettingJDBC;
import DentistClinic.dao.impl.AddressDaoH2;
import DentistClinic.model.Address;
import DentistClinic.service.AddressService;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AddressServiceTest {
    /** Attributes **/
    private static final Logger LOGGER = Logger.getLogger(AddressServiceTest.class);
    private AddressService addressService = new AddressService(new AddressDaoH2(new SettingJDBC()));
    
    /** Tests **/
    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void saveAddressTest() {
        LOGGER.info("Registering address at H2...");
        Address address = addressService.save(new Address("Av. Eldorado", 2154,
                "São Paulo", "Morumbi"));
        assertNotNull(address.getId());
        System.out.println(address.toString());
    }
}