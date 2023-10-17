package com.example.demo.SpringTest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.*;

import java.util.List;

@Table(name = "microUsers")
@jakarta.persistence.Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @Column(name = "ID",length = 150)
    private String id;
    private String name;
    private String email;
    private String phNo;
    @Transient
    private List<Ratings> ratingsList;
}
