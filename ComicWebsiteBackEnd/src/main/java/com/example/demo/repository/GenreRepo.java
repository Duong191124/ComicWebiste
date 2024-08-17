package com.example.demo.repository;

import com.example.demo.model.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genres, Integer> {
}
