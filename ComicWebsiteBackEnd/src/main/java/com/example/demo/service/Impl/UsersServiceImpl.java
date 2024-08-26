package com.example.demo.service.Impl;

import com.example.demo.dto.UsersDTO;
import com.example.demo.model.Users;

import java.util.List;

public interface UsersServiceImpl {
    List<Users> getAll();
    Users add(UsersDTO usersDTO);
    Users update(Integer id, UsersDTO usersDTO);
    Users getUserById(Integer id);
    void delete(Integer id);
}
