package com.example.dentalclinic.service.impl;

import com.example.dentalclinic.model.User;
import com.example.dentalclinic.service.DentalClinicService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements DentalClinicService<User> {
    /** Attribute **/
    private static Map<Integer, User> userMap = new HashMap<>();

    /** Methods **/
    @Override
    public User save(User user) {
        userMap.put(user.getId(), user);
        return user;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public String delete(Integer id) {
        userMap.remove(id);
        return "Deleted user";
    }
}
