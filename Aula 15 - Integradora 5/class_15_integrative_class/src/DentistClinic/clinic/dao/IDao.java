package DentistClinic.clinic.dao;

import java.util.List;

public interface IDao<T> {
    T salvar(T t);
    List<T> buscarTodos();
    void excluir(Integer id);
    T modificar(T t);
}
