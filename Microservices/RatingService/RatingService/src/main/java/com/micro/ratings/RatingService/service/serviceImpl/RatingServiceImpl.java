package com.micro.ratings.RatingService.service.serviceImpl;

import com.micro.ratings.RatingService.entities.Ratings;
import com.micro.ratings.RatingService.repository.RatingRepo;
import com.micro.ratings.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepo ratingRepo;
    @Override
    public Ratings create(Ratings ratings) {
        return ratingRepo.save(ratings);
    }

    @Override
    public List<Ratings> getAllRatings() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Ratings> getAllRatingsByUserId(String userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Ratings> getAllRatingsByhotelId(String hotelId) {

        return ratingRepo.findByHotelId(hotelId);
    }
}
