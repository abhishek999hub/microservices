package com.example.demo.SpringTest.repo;

import com.example.demo.SpringTest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<User, String> {

}
