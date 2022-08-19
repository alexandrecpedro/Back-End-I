package com.example.user.service;

import com.example.user.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    /** Method **/
    public User createUser(String name, int age) {
        User user = new User(name, age);
        return user;
    }
}
