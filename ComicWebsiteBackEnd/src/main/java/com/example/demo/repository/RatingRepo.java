package com.example.demo.repository;

import com.example.demo.model.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Ratings, Integer> {
}
