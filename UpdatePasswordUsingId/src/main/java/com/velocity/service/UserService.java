package com.velocity.service;

import com.velocity.model.User;

public interface UserService {
public User saveUser(User user);	
public User updateUser(User user);
public User getUser(Integer id) throws Exception;
}
