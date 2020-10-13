package com.example.project.services;

import com.example.project.dao.UserDao;
import com.example.project.dao.UserDaoImpl;
import com.example.project.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDao userDao = new UserDaoImpl();

    public void add(User user) {
        userDao.add(user);
    }


    public void delete(User user) {
        userDao.delete(user);
    }


    public void update(User user) {
        userDao.update(user);
    }

    public User getById(int id) {
        return userDao.getById(id);
    }
}
