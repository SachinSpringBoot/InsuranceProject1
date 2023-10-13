package com.velocity.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/getUser/{id}/{userId}")
    public User getUser(@PathVariable("id") Integer id,@PathVariable("id") Integer userId) {
    User user1=userService.getUser(id);
List<Premium> list=premiumService.getPremiumByUserId(userId);
   for(Premium premium:list) {
	   user1.setId(premium.getUserId());
	   user1.setPlist(list);
	   
   }
   return user1;
    }
}
