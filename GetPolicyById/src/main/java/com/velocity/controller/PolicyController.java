package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Policy;
import com.velocity.service.PolicyService;

@RestController
public class PolicyController {
	@Autowired
	private PolicyService policyservice;
	@GetMapping("/getPolicyById/{policyId}")
	public Policy getPolicyById(@PathVariable("policyId") Integer policyId) {
Policy policy=policyservice.getPolicyById(policyId);
  return policy;
	}
}
