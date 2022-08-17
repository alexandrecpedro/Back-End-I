package Checkpoint_I.clinic.dao;

import java.util.List;

public interface IDao<T> {
    T salvar(T t);
    List<T> buscarTodos();
    T excluir(T t);
    T modificar(T t, String rua);
}
