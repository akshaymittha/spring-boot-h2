package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("user not found with id : " + id));
    }

    @Override
    public List<User> getUsers() {
        return repository.findAll();
    }

    @Override
    public User updateUser(User user, Long id) {
        user.setId(id);
        return repository.save(user);
    }

    @Override
    public String deleteUser(Long id) {
        repository.deleteById(id);
        return "user deleted successfully";
    }
}
