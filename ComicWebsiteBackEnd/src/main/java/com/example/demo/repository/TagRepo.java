package com.example.demo.repository;

import com.example.demo.model.Tags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepo extends JpaRepository<Tags, Integer> {
}
