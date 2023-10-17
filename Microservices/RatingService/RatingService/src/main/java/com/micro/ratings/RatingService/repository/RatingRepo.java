package com.micro.ratings.RatingService.repository;

import com.micro.ratings.RatingService.entities.Ratings;
import org.springframework.data.mongodb.repository.MongoRepository;//for mongodb

import java.util.List;

public interface RatingRepo extends MongoRepository<Ratings , String> {

    //custom find methods
    List<Ratings> findByUserId(String userId);

    List<Ratings> findByHotelId(String hotelId);


}
