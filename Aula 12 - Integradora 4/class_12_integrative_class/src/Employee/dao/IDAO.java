package Employee.dao;

import Employee.model.Employee;

import java.util.List;

public interface IDAO<T> {
    void insert(T t);
    void update(T t);
    Employee findById(int id);
    List<Employee> findAll();
    void delete(String field, Object o);
}
