package com.velocity.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Premium;
import com.velocity.model.User;
import com.velocity.service.PremiumService;
import com.velocity.service.UserService;

@RestController
public class UserPremiumController {
	@Autowired
private UserService userService;
	@Autowired
private PremiumService premiumService; 
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
	User user1=userService.saveUser(user);
List<Premium> list=user.getPlist();
for (Premium premium:list) {
	premium.setUserId(user.getId());
	premiumService.savePremium(premium);
	
}
   return user1;
	}
}
