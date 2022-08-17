package DentistClinic.test;

import DentistClinic.clinic.dao.ConfiguracaoJDBC;
import DentistClinic.clinic.dao.impl.EnderecoDaoImpl;
import DentistClinic.clinic.model.Endereco;
import DentistClinic.clinic.service.EnderecoService;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class EnderecoServiceTest {
    /** Attributes **/
    private static final Logger LOGGER = Logger.getLogger(EnderecoServiceTest.class);
    private EnderecoService enderecoService = new EnderecoService(new EnderecoDaoImpl(new ConfiguracaoJDBC()));
    
    /** Tests **/
    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void saveAddressTest() {
        LOGGER.info("Registering address at H2...");
        Endereco endereco = enderecoService.salvar(new Endereco("Av. Eldorado", 2154,
                "São Paulo", "Morumbi"));
        assertNotNull(endereco.getId());
        System.out.println(endereco.toString());
    }
}