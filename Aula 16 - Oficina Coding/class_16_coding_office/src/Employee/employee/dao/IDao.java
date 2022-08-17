package Employee.employee.dao;

public interface IDao<T> {
    T save(T t);
}
