package com.example.demo.repository;

import com.example.demo.model.Chapters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepo extends JpaRepository<Chapters, Integer> {
}
