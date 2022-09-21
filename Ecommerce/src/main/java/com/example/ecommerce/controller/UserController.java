package com.example.ecommerce.controller;

import com.example.ecommerce.entity.dto.UserDTO;
import com.example.ecommerce.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    /** Attribute **/
    @Autowired
    private UserServiceImpl userService;

    /** Method **/
    @PostMapping
    public ResponseEntity<String> create(@RequestBody UserDTO userDTO) {
        Boolean create = userService.create(userDTO);

        return (create ?
                new ResponseEntity<>("Successfully created user!", HttpStatus.CREATED)
                : new ResponseEntity<>("User cannot be created!", HttpStatus.CONFLICT));
    }
}
