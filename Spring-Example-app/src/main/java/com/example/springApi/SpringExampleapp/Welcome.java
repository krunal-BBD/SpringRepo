package com.example.springApi.SpringExampleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/welcome")
    public String wel()
    {
        return "Welcome Krunal";
    }

}
