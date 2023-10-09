package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.User;
import com.velocity.service.UserService;

@RestController
public class UserController {
	@Autowired
   private UserService userService;
	@PutMapping("/UpdateUser")
	public User UpdateUser(@RequestBody  User user) {
	User user1=userService.UpdateUser(user);
	return user1;
		
	}
}
