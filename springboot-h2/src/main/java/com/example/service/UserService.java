package com.example.service;

import com.example.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    User getUserById(Long id);

    List<User> getUsers();

    User updateUser(User user, Long id);

    String deleteUser(Long id);
}
