package com.example.project.dao;

import com.example.project.dto.UserDto;
import com.example.project.models.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void update(User user);
    User getById(int id);
    List<UserDto> findByName(String name);
}
