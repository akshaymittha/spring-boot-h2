package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @GetMapping("/all")
    public List<User> getAllUser() {
        return service.getUsers();
    }

    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Long id) {
        return service.updateUser(user, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        return service.deleteUser(id);
    }
}
