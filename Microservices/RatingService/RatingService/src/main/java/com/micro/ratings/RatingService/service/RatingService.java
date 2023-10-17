package com.micro.ratings.RatingService.service;

import com.micro.ratings.RatingService.entities.Ratings;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {
    //create
    Ratings create(Ratings ratings);

    //getALlRatings
    List<Ratings> getAllRatings();

    //getRatingbyUserId
    List<Ratings> getAllRatingsByUserId(String id);

    //getALlbyHotel
    List<Ratings> getAllRatingsByhotelId(String hotelId);
}
