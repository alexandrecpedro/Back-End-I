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

    public void excluir(Integer id) {
        enderecoIDao.excluir(id);
    }

    public Endereco modificar(Endereco endereco) {
        return enderecoIDao.modificar(endereco);
    }
}
