package DentistClinic.test;

import DentistClinic.clinic.dao.ConfiguracaoJDBC;
import DentistClinic.clinic.dao.impl.EnderecoDaoImpl;
import DentistClinic.clinic.dao.impl.PacienteDaoImpl;
import DentistClinic.clinic.model.Endereco;
import DentistClinic.clinic.model.Paciente;
import DentistClinic.clinic.service.EnderecoService;
import DentistClinic.clinic.service.PacienteService;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PacienteServiceTest {
    /** Attributes **/
    private static final Logger LOGGER = Logger.getLogger(EnderecoServiceTest.class);
    private PacienteService pacienteService = new PacienteService(new PacienteDaoImpl(new ConfiguracaoJDBC()));
    private EnderecoService enderecoService = new EnderecoService(new EnderecoDaoImpl(new ConfiguracaoJDBC()));

    /** Tests **/
    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void salvarPacienteTest() {
        LOGGER.info("Salvando paciente no H2...");
        Paciente paciente = pacienteService.salvar(new Paciente("João", "Silva",
                "8482828/FT", new Date(), Integer.parseInt(String.valueOf(enderecoService.salvar(new Endereco("Av. Eldorado", 2154,
                "São Paulo", "Morumbi"))))));
        assertNotNull(paciente.getId());
    }

    @Test
    public void buscarTodosTest() {
        LOGGER.info("Buscando pacientes no H2...");
        Paciente paciente = pacienteService.salvar(new Paciente("João", "Silva",
                "8482828/FT", new Date(), Integer.parseInt(String.valueOf(enderecoService.salvar(new Endereco("Av. Eldorado", 2154,
                "São Paulo", "Morumbi"))))));

        List<Paciente> pacientes = pacienteService.buscarTodos();
        assertNotNull(pacientes);
    }

}