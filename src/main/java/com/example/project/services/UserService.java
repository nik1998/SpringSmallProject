package com.example.project.services;

import com.example.project.dao.UserDao;
import com.example.project.dto.UserDto;
import com.example.project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void add(User user) {
        userDao.add(user);
    }

    private final AtomicLong counter = new AtomicLong();

    public void addMyUser()
    {
        User user = new User();
        user.setName("User"+counter.incrementAndGet());
        user.setPassword("new password");
        userDao.add(user);
    }

    public int getCurrentUserId()
    {
        return counter.intValue()+4;
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
    public List<UserDto> findByName(String name) {

        if(name.equalsIgnoreCase("insert") || name.equalsIgnoreCase("drop"))
        {
            name="xaxaxa";
        }
        List<UserDto> users = userDao.findByName(name);
        return users.stream().map(x-> { if(x.getId()<=2) x.setPassword("Hidden"); return x; }).collect(Collectors.toList());
    }
}
