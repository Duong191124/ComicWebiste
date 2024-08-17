package com.example.demo.repository;

import com.example.demo.model.ImagesStory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageStoryRepo extends JpaRepository<ImagesStory, Integer> {
}
