package com.example.demo.SpringTest.Service.impl;

import com.example.demo.SpringTest.Service.ApiService;
import com.example.demo.SpringTest.entity.User;
import com.example.demo.SpringTest.exception.ResourceNotFoundException;
import com.example.demo.SpringTest.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements ApiService {

    @Autowired
    Repo repo;
    @Override
    public User createUser(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return repo.findAll();
    }

    @Override
    public User getUserById(String id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found by ID"+id));
    }

    @Override
    public User updateUser(User user) {

        return repo.save(user);
    }

    @Override
    public void deleteUser(String id) {

        repo.deleteById(id);
    }
}
