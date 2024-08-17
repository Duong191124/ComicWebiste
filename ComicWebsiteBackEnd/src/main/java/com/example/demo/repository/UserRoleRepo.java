package com.example.demo.repository;

import com.example.demo.model.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepo extends JpaRepository<UserRoles, Integer> {
}
