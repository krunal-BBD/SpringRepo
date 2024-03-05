package com.example.springApi.SpringExampleapp.repository;
import com.example.springApi.SpringExampleapp.api.model.User;
import com.example.springApi.SpringExampleapp.api.model.User2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empRepo extends JpaRepository<User2,Long> {
}
