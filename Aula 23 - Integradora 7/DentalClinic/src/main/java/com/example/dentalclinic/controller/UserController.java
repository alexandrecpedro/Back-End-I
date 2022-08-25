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

    @GetMapping("/search")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        if (!userService.findAll().stream().filter(user -> user.getId() == id).equals(null)) {
            userService.delete(id);
            return ResponseEntity.ok("Successfully deleted");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
