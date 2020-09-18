package com.example.project.dao;

import com.example.project.models.User;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(int id);
}
