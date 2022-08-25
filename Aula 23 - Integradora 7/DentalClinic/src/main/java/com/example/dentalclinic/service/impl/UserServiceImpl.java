package com.example.dentalclinic.service.impl;

import com.example.dentalclinic.model.User;
import com.example.dentalclinic.service.DentalClinicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements DentalClinicService<User> {
    /** Attribute **/
    private ;

    /** Constructor **/

    /** Methods **/
    @Override
    public User save(User user) {}

    @Override
    public Optional<User> find(Integer id) {}

    @Override
    public List<User> findAll() {}

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(Integer id) {
    }
}
