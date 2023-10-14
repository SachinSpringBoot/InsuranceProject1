package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.User;
import com.velocity.service.UserService;

@RestController
public class UserController {
	@Autowired
private UserService userService;
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
	User user1=userService.saveUser(user);
	return user1;
	}
	@GetMapping("/update/{id}")
	public Boolean updatePassword(@PathVariable("id") Integer id,@RequestParam("password") String password)throws Exception
	{
	User user1=userService.getUser(id);
	if(user1 !=null)
	{
		user1.setPassword(password);
		userService.updateUser(user1);
		return true;
	}
	return false;
	}	

}
