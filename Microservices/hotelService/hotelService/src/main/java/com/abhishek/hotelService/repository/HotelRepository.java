package com.abhishek.hotelService.repository;

import com.abhishek.hotelService.Entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity,String> {

}
