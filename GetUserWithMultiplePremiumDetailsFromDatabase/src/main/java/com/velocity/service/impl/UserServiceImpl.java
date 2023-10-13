package com.velocity.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.velocity.model.User;
import com.velocity.repository.UserRepository;
import com.velocity.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
 private UserRepository userRepository;
	@Override
	public User getUser(Integer id) {
	@SuppressWarnings("deprecation")
	User user1=userRepository.getById(id);
		return user1;
	}
}
