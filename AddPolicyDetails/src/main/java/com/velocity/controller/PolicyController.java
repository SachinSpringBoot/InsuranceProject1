package com.velocity.controller;


import java.sql.Date;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Policy;
import com.velocity.service.PolicyService;

@RestController
public class PolicyController {
	@Autowired
private PolicyService policyService;
	@PostMapping("/savePolicy")
	public Policy savePolicy(@RequestBody Policy policy) {
		//To Set Today Date
		Date date = Date.valueOf(LocalDate.now());
		//java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
		policy.setCreatedDate(date);
		Date expirydate = Date.valueOf(LocalDate.now().plusDays(1825));
		policy.setPolicyExpirydate(expirydate);
	
	  Policy policy1	=policyService.savePolicy(policy);
	return policy1;
		
	}
}
