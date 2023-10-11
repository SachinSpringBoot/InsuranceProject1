package com.velocity.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.ClaimDetails;
import com.velocity.model.User;
import com.velocity.service.ClaimDetailsService;
import com.velocity.service.UserService;

@RestController
public class UserClaimDetailsController {
	@Autowired
	private UserService userService;
	@Autowired
	private ClaimDetailsService claimDetailsService;
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody  User user) {
	 User user1=userService.saveUser(user);
	  List<ClaimDetails>  list =user.getClist();
	  
	  for(ClaimDetails cdetails:list)
	  {
		  cdetails.setUserId(user.getId());
		  claimDetailsService.saveClaimDetails(cdetails);
	  }
	  return user1;
	}


}
