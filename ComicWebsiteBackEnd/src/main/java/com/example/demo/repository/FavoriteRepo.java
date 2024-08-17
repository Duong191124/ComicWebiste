package com.example.demo.repository;

import com.example.demo.model.Favorites;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepo extends JpaRepository<Favorites, Integer> {
}
