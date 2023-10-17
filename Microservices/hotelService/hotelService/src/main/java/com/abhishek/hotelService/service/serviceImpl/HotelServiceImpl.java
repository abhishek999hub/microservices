package com.abhishek.hotelService.service.serviceImpl;

import com.abhishek.hotelService.Entity.HotelEntity;
import com.abhishek.hotelService.exception.ResorceNotFoundExceptions;
import com.abhishek.hotelService.repository.HotelRepository;
import com.abhishek.hotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public HotelEntity create(HotelEntity hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<HotelEntity> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public HotelEntity getHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResorceNotFoundExceptions("Hotel not found by given id: "+id));
    }

    @Override
    public HotelEntity updateUser(HotelEntity hotel) {
        return null;
    }

    @Override
    public void deleteHotel(String id) {

    }
}
