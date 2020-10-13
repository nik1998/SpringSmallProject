package com.example.project.controllers;

import com.example.project.models.User;
import com.example.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/add")
    public String add(@RequestParam(value = "user", required = true) User user) {
        userService.add(user);
        return "Ok";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getById(id);
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(value = "user", required = true) int id) {
        User user = userService.getById(id);
        userService.delete(user);
        return "Ok";
    }
}
