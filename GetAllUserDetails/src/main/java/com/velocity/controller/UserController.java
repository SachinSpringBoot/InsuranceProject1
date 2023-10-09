package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.User;
import com.velocity.service.UserService;

@RestController
public class UserController {
	@Autowired
private UserService userService;
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
	List<User>	user1=userService.getAllUser();
	return user1;
	}
}
