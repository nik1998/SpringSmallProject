package com.example.project.controllers;

import com.example.project.dto.UserDto;
import com.example.project.models.User;
import com.example.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/search")
    public List<UserDto> search(@RequestParam(value = "username", required = true) String username) {
        return userService.findByName(username);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        if(id==2)
        {
            return null;
        }
        return userService.getById(id);
    }

    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public User getPostUser(@RequestBody User user) {
        int id = user.getId();
        if(id==2)
        {
            return userService.getById(id);
        }
        user.setPassword("Post request only for root");
        return user;
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(value = "user", required = true) int id) {
        //User user = userService.getById(id);
        //userService.delete(user);
        return "Ok";
    }
}
