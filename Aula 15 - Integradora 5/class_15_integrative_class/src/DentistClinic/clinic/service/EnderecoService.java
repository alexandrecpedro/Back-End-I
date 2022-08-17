package DentistClinic.clinic.service;

import DentistClinic.clinic.model.Endereco;
import DentistClinic.clinic.dao.IDao;

import java.util.List;

public class EnderecoService {
    /** Attribute **/
    private IDao<Endereco> enderecoIDao;

    /** Constructor **/
    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    /** Method **/
    public Endereco salvar(Endereco endereco) {
        return enderecoIDao.salvar(endereco);
    }

    public List<Endereco> buscarTodos() {
        return enderecoIDao.buscarTodos();
    }

    public Endereco excluir(Endereco endereco) {
        return enderecoIDao.excluir(endereco);
    }

    public Endereco modificar(Endereco endereco, String rua) {
        return enderecoIDao.modificar(endereco, rua);
    }
}
