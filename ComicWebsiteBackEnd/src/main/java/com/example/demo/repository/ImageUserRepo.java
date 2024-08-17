package com.example.demo.repository;

import com.example.demo.model.ImagesUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageUserRepo extends JpaRepository<ImagesUser, Integer> {
}
