package com.example.demo.service;

import com.example.demo.dto.UsersDTO;
import com.example.demo.model.Users;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.Impl.UsersServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsersService implements UsersServiceImpl {

    private final UserRepo userRepo;

    @Override
    public List<Users> getAll() {
        return userRepo.findAll();
    }

    @Override
    public Users add(UsersDTO usersDTO) {
        return null;
    }

    @Override
    public Users update(Integer id, UsersDTO usersDTO) {
        return null;
    }

    @Override
    public Users getUserById(Integer id) {
        return userRepo.findById(id).orElseThrow();
    }

    @Override
    public void delete(Integer id) {
        Users existingUser = getUserById(id);
        userRepo.delete(existingUser);
    }
}
