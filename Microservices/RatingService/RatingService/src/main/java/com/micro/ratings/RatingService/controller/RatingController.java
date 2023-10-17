package com.micro.ratings.RatingService.controller;

import com.micro.ratings.RatingService.entities.Ratings;
import com.micro.ratings.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;
    @PostMapping
    public ResponseEntity<Ratings> createRating(@RequestBody Ratings ratings)
    {
        Ratings ratings1 = ratingService.create(ratings);
        return ResponseEntity.status(HttpStatus.CREATED).body(ratings1);
    }

    @GetMapping
    public ResponseEntity<List<Ratings>> getAllRatings()
    {
        return ResponseEntity.ok().body(ratingService.getAllRatings());
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Ratings>> getAllRatingsByUserId(@PathVariable String userId)
    {
        return ResponseEntity.ok().body(ratingService.getAllRatingsByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Ratings>> getAllRatingsByHotelId(@PathVariable String hotelId)
    {
        List<Ratings> ratings = ratingService.getAllRatingsByhotelId(hotelId);
        return ResponseEntity.ok().body(ratings);
    }
}
