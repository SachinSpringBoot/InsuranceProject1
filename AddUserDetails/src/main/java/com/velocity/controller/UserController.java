package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.User;
import com.velocity.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userServie;
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User user1=userServie.saveUser(user);
		return user1;
		
	}

}
