package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Policy;
import com.velocity.service.PolicyService;

@RestController
public class PolicyController {
	@Autowired
 private PolicyService policyService;
	@GetMapping("/getAllPolicy")
	public List<Policy> getAllPolicy(){
		List<Policy> list	=policyService.getAllPolicy();
		return list;
	}
}
