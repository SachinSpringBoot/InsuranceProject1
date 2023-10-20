package com.velocity.restcontroller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Policy;
import com.velocity.model.Premium;
import com.velocity.model.User;
import com.velocity.service.PolicyService;
import com.velocity.service.PremiumService;
import com.velocity.service.UserService;

@RestController
public class UserPolicyPremiumController {
	@Autowired
 private UserService userService;
	@Autowired
 private PolicyService policyService;
	@Autowired
 private PremiumService premiumService;
	@PostMapping("/saveUser")
	public User saveUser( @RequestBody User user) {
	User user1=userService.saveUser(user);
List<Policy> list=user.getPlist();
     List<Premium> list1=user.getPrelist();
   for(Policy policy:list)
   {
	   policy.setUserId(user1.getId());
	   Date date=Date.valueOf(LocalDate.now());
	   policy.setCreatedDate(date);
	   policyService.savePolicy(policy);
   }
   for(Premium premium:list1)
   {
	   premium.setUserId(user1.getId());
	   premiumService.savePremium(premium);
   }
return user1;
   
	}
}
