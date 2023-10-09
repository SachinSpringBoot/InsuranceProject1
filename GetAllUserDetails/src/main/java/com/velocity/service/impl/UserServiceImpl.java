package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.User;
import com.velocity.repository.UserRepository;
import com.velocity.service.UserService;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
	private UserRepository userRepository;
	@Override
	public List<User> getAllUser() {
	List<User> user1=userRepository.findAll();
		return user1;
	}

}
