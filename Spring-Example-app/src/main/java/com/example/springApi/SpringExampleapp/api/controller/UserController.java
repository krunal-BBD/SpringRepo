package com.example.springApi.SpringExampleapp.api.controller;
import com.example.springApi.SpringExampleapp.api.model.User;
import com.example.springApi.SpringExampleapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        return userService.getUser(id);
    }

    @GetMapping("/user1")
    public User getUser1(@RequestParam Integer id){
        Optional<User> user = Optional.ofNullable(userService.getUser(id));
        if(user.isPresent()){
            return (User)user.get();
        }
        return null;
    }
}
