package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    /** Attribute **/
    private UserService userService;

    /** Method **/
    @GetMapping("/")
    public User createUser() {
        return userService.createUser("Diego", 24);
    }

    @GetMapping("/create2")
    public User createUser2() {
        return userService.createUser("Alicia", 45);
    }
}
