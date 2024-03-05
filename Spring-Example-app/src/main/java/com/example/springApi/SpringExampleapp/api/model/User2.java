package com.example.springApi.SpringExampleapp.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "User_tbl")
public class User2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;
    private String UserName;
    private int UserAge;
    private String UserEmail;

    @Override
    public String toString() {
        return "User2{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", UserAge=" + UserAge +
                ", UserEmail='" + UserEmail + '\'' +
                '}';
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getUserAge() {
        return UserAge;
    }

    public void setUserAge(int userAge) {
        UserAge = userAge;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }
}
