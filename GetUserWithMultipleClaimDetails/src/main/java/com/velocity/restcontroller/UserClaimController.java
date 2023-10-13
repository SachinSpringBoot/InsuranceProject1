package com.velocity.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Claim;
import com.velocity.model.User;
import com.velocity.service.ClaimService;
import com.velocity.service.UserService;

@RestController
public class UserClaimController {
    @Autowired
	private UserService userService;
    @Autowired
    private ClaimService claimService;
    @GetMapping("/getUser/{id}/{claim_id}")
    public User getUser(@PathVariable("id") Integer id, @PathVariable("claim_id")Integer claim_id) {
    User user1=userService.getUser(id);
 List<Claim> claimlist =claimService.getClaimListById(claim_id);
 for(Claim claim:claimlist) {
	 user1.setId(claim.getUserId());
	 user1.setClist(claimlist);
 }
	return user1;
    
    }
}
