package com.example.demo.repository;

import com.example.demo.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comments, Integer> {
}
