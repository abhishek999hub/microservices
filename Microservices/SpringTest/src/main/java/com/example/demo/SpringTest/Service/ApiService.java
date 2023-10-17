package com.example.demo.SpringTest.Service;

import com.example.demo.SpringTest.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ApiService {
    //create user
    User createUser(User user);

    //get all user
    List<User> getAllUser();

    //get one user by Id
    User getUserById(String id);

    //modify userdetails by Id
    User updateUser(User user);

    //Delete useDetails by ID
    void deleteUser(String id);

}
