package com.velocity.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Policy;
import com.velocity.service.PolicyService;

@RestController
public class PolicyRestController {
	@Autowired
	private PolicyService policyService;
@PutMapping("/updatePolicy")
	public Policy updatePolicy(@RequestBody  Policy policy) {

		return policyService.updatePolicy(policy);
	}
}
