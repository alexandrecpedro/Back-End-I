package com.example.dentalclinic.controller;

import com.example.dentalclinic.model.User;
import com.example.dentalclinic.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    /** Attribute **/
    @Autowired
    private UserServiceImpl userService;

    /** Methods **/
    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(userService.find(id).orElse(null));
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user) {
        return ((!user.getId().equals(null)) && userService.find(user.getId()).isPresent()) ?
                ResponseEntity.ok(userService.save(user)) :
                ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        if (userService.find(id).isPresent()) {
            userService.delete(id);
            return ResponseEntity.ok("Successfully deleted");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
