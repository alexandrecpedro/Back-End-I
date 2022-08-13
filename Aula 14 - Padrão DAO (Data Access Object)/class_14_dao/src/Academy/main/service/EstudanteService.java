package Academy.main.service;

import Academy.main.dao.IDao;
import Academy.main.model.Estudante;

import java.util.List;

public class EstudanteService {
    /** Attribute **/
    private IDao<Estudante> estudanteDao;

    /** Constructor **/
    public EstudanteService() {
    }

    public EstudanteService(IDao<Estudante> estudanteDao) {
        this.estudanteDao = estudanteDao;
    }

    /** Setter **/
    public void setEstudanteDao( IDao<Estudante> estudanteDao) {
        this.estudanteDao = estudanteDao;
    }

    /** Methods **/
    public Estudante salvarEstudante(Estudante estudante){
        estudanteDao.salvar(estudante);
        return estudante;
    }
    public List<Estudante> buscarTodos(){
        return estudanteDao.buscarTodos();
    }

    public Estudante buscar(String id){
        return estudanteDao.buscar(id);
    }

}
