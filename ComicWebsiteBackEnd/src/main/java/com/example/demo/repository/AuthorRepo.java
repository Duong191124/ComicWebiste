package com.example.demo.repository;

import com.example.demo.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Authors, Integer> {
}
