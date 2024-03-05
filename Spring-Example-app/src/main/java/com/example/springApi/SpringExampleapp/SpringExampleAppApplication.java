package com.example.springApi.SpringExampleapp;

import com.example.springApi.SpringExampleapp.api.model.User2;
import com.example.springApi.SpringExampleapp.repository.empRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class SpringExampleAppApplication implements CommandLineRunner {

	@Autowired
	private empRepo emprepo;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		String sql = "select * from User_tbl";
//		List<User2> user2s =jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User2.class));
//
//		user2s.forEach(System.out :: println);
		
		List<User2> users = emprepo.findAll();
		users.forEach(System.out ::println);
	}
}
