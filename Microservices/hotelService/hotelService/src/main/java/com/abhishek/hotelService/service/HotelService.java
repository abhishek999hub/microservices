package com.abhishek.hotelService.service;

import com.abhishek.hotelService.Entity.HotelEntity;

import java.util.List;

public interface HotelService {
    //create
    HotelEntity create(HotelEntity hotel);
    //getAll
    List<HotelEntity> getAllHotels();
    //get
    HotelEntity getHotel(String id);
    //update
    HotelEntity updateUser(HotelEntity hotel);

    //Delete useDetails by ID
    void deleteHotel(String id);
}
