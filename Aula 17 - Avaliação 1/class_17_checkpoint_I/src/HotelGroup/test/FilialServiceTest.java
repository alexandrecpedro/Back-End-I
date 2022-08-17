package HotelGroup.test;

import HotelGroup.filial.dao.config.ConfiguracaoJDBC;
import HotelGroup.filial.dao.impl.FilialDaoImpl;
import HotelGroup.filial.model.Filial;
import HotelGroup.filial.service.FilialService;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FilialServiceTest {
    /** Attributes **/
    private final static Logger LOGGER = Logger.getLogger(FilialServiceTest.class);
    private FilialService filialService = new FilialService(new FilialDaoImpl(new ConfiguracaoJDBC()));
    
    /** Tests **/
    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void salvarFilialTest() {
        Filial filial, filialCentro;

        filial = new Filial("Centro", "Avenida São João", "439", "São Paulo", "SP", true);
        filialCentro = filialService.salvar(filial);

        filial = new Filial("Leste", "Rua Adelaide de Freitas", "36", "São Paulo", "SP", false);
        filialCentro = filialService.salvar(filial);

        filial = new Filial("Sul", "Rua Afonso Celso", "235", "São Paulo", "SP", false);
        filialCentro = filialService.salvar(filial);

        filial = new Filial("Norte-Santana", "Avenida João Marcelino Branco", "78",  "São Paulo", "SP", true);
        filialCentro = filialService.salvar(filial);

        filial = new Filial("Oeste-Freguesia", "Rua Almo Abrahão Bertazzo", "154",  "São Paulo", "SP", true);
        filialCentro = filialService.salvar(filial);

        assertNotNull(filial.getId());
    }

    @Test
    public void listarFiliaisTest() {
        List<Filial> filiais = filialService.listar();
        assertEquals(5, filiais.size());
    }
}