package com.abhishek.hotelService.controller;

import com.abhishek.hotelService.Entity.HotelEntity;
import com.abhishek.hotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @PostMapping
    public ResponseEntity<HotelEntity> createHotel(@RequestBody HotelEntity hotel)
    {
        HotelEntity hotel1 = hotelService.create(hotel);
     return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }
    @GetMapping("{id}")
    public ResponseEntity<HotelEntity> getHotelById(@PathVariable String id)
    {
        HotelEntity hotel = hotelService.getHotel(id);

        return ResponseEntity.ok(hotel);
    }

    @GetMapping
    public ResponseEntity<List<HotelEntity>> getAllHotels()
    {
        List<HotelEntity> hotel = hotelService.getAllHotels();
        return ResponseEntity.ok(hotel);
    }

}
