package com.velocity.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Nominee;
import com.velocity.model.User;
import com.velocity.service.NomineeService;
import com.velocity.service.UserService;

@RestController
public class UserNomineeController {
	@Autowired
	private UserService userService;
	@Autowired
	private NomineeService nomineeService;

	@PostMapping("/saveUser")
	public User saveUser(User user) {
		User user1 = userService.saveUser(user);
		List<Nominee> list = user.getNlist();
		for (Nominee nominee : list) {
			nominee.setUserId(user.getId());
			nomineeService.saveNominee(nominee);
		}
		return user1;
	}
}
