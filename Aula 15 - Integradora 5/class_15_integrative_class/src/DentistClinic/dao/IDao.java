package DentistClinic.dao;

public interface IDao<T> {
    T save(T t);
}
