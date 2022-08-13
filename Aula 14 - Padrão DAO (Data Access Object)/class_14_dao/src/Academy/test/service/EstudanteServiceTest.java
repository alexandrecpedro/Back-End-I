package Academy.test.service;

import Academy.main.dao.ConfiguracaoJDBC;
import Academy.main.dao.IDao;
import Academy.main.dao.impl.EstudanteDaoEmMemoria;
import Academy.main.dao.impl.EstudanteDaoH2;
import Academy.main.model.Estudante;
import Academy.main.service.EstudanteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class EstudanteServiceTest {
    private IDao<Estudante> estudanteDaoEmMemoria = new EstudanteDaoEmMemoria(new ArrayList());
    private IDao<Estudante> estudanteDaoH2 = new EstudanteDaoH2(new ConfiguracaoJDBC());
    private EstudanteService estudanteService = new EstudanteService();

    @Before
    public void carregarEstudantesAlterandoImplementacaoDAO() {
        estudanteService.setEstudanteDao(estudanteDaoEmMemoria);
        estudanteService.salvarEstudante(new Estudante(
                "1", "EstudanteUm", "SobrenomeUm"));
        estudanteService.setEstudanteDao(estudanteDaoH2);
        estudanteService.salvarEstudante(new Estudante(
                "2", "EstudanteDois", "SobrenomeDois"));
    }

    @Test
    public void buscarEstudantesAlterandoImplementacaoDAO(){
        estudanteService.setEstudanteDao(estudanteDaoEmMemoria);
        Estudante estudante = estudanteService.buscar("1");
        Assert.assertEquals(estudante.getId(),"1");
        Assert.assertEquals(estudante.getNome(),"EstudanteUm");
        Assert.assertEquals(estudante.getSobrenome(),"SobrenomeUm");
        estudanteService.setEstudanteDao(estudanteDaoH2);
        estudante = estudanteService.buscar("2");
        Assert.assertEquals(estudante.getId(),"2");
        Assert.assertEquals(estudante.getNome(),"EstudanteDois");
        Assert.assertEquals(estudante.getSobrenome(),"SobrenomeDois");
    }

}
