package com.example.project.services;

import com.example.project.dao.UserDao;
import com.example.project.dao.UserDaoImpl;
import com.example.project.models.User;

public class UserService {

    private UserDao userDao = new UserDaoImpl();

    public void add(User user) {
        userDao.add(user);
    }


    public void delete(User user) {
        userDao.delete(user);
    }


    public void edit(User user) {
        userDao.edit(user);
    }

    public User getById(int id) {
        return userDao.getById(id);
    }
}
