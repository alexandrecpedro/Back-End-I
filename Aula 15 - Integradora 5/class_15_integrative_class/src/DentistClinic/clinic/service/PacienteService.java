package DentistClinic.clinic.service;

import DentistClinic.clinic.dao.IDao;
import DentistClinic.clinic.model.Paciente;

import java.util.List;

public class PacienteService {
    /** Attribute **/
    private IDao<Paciente> pacienteIDao;

    /** Constructor **/
    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    /** Method **/
    public Paciente salvar(Paciente paciente) {
        return pacienteIDao.salvar(paciente);
    }

    public List<Paciente> buscarTodos() {
        return pacienteIDao.buscarTodos();
    }

    public void excluir(Integer id) {
        pacienteIDao.excluir(id);
    }

    public Paciente modificar(Paciente paciente) {
        return pacienteIDao.modificar(paciente);
    }
}
