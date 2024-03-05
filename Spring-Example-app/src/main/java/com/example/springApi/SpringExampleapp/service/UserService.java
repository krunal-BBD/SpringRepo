package com.example.springApi.SpringExampleapp.service;

import com.example.springApi.SpringExampleapp.api.model.User;
import com.example.springApi.SpringExampleapp.repository.empRepo;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private List<User> userList;
    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1,"Krunal",22,"kr@em.com");
        User user2 = new User(2,"Dev",21,"krs@em.com");
        User user3 = new User(3,"Chirag",24,"krsss@em.com");
        User user4 = new User(4,"Ani",20,"kraaa@em.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4));
    }

    public User getUser(Integer id) {
        User u = null;
        for(User user : userList){
            if(id == user.getId()){
                u = user;
            }
        }
        return u;
    }

    public Optional<User> getUser(int id){
        Optional optional = Optional.empty();
        for(User user:userList){
            if(id==user.getId())
            {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
