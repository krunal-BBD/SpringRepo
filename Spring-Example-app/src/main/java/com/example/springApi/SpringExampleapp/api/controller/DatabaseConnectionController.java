package com.example.springApi.SpringExampleapp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class DatabaseConnectionController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("/checkConnection")
    public String checkDatabaseConnection(){
        try{
            Connection connection = dataSource.getConnection();
            if(connection.isValid(5)) // check if the connection is valid within 5 seconds
            {
                return "Database Connection is Valid";
            }
            else{
                return "Database Connection not Valid";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
