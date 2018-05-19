package com.ujjwal;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ujjwal.entity.Skill;
import com.ujjwal.entity.User;
import com.ujjwal.repository.UserRepository;

@SpringBootApplication
public class UjjwalApplication {
	@Autowired
	UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(UjjwalApplication.class, args);
	}
	@PostConstruct
	public void setupDbWithData(){
		User user= new User("Ujjwal", null);
		user.setSkills(Arrays.asList(new Skill("java"), new Skill("js")));
		user= userRepository.save(user);
	}
}
