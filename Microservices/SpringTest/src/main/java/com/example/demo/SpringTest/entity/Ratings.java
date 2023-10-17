package com.example.demo.SpringTest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
public class Ratings {
    private String id;
    private String userId;
    private String HotelId;
    private int ratings;
    private String feedback;


}
