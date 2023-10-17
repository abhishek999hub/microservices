package com.example.demo.SpringTest.controller;

import com.example.demo.SpringTest.Service.ApiService;
import com.example.demo.SpringTest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserServiceController {
    @Autowired
    private ApiService apiService;
    //below code is for constructor injection
    /*public  UserServiceController(ApiService apiService)
    {
        this.apiService =apiService;
    }*/
//for creating a user
    @PostMapping
    public ResponseEntity<User> getApiService(@RequestBody User user) {
        User user1 = apiService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    //for getting one user
    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable String id)
    {
       User user = apiService.getUserById(id);
       // return ResponseEntity.ok().body(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser()
    {
        List<User> Alluser = apiService.getAllUser();
        return ResponseEntity.ok(Alluser);
    }
    @PutMapping("{id}")
    public ResponseEntity<User>  updateUser(@PathVariable String id , @RequestBody User user)
    {
        User existingUser = apiService.getUserById(id);

        if (existingUser == null) {
            return ResponseEntity.notFound().build();
        }

        // Perform the update
        existingUser.setId(user.getId());
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        existingUser.setPhNo(user.getPhNo());
        // Update other fields as needed

        // Save the updated user
        User updated = apiService.updateUser(existingUser);

        return ResponseEntity.ok(updated);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id)
    {
        User existingUser = apiService.getUserById(id);

        if (existingUser == null) {
            return ResponseEntity.notFound().build();
        }
        apiService.deleteUser(id);
        String s = "User deleted with Id: "+ id;
        return ResponseEntity.ok(s);
    }
}
