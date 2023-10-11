package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Policy;
import com.velocity.repository.PolicyRepository;
import com.velocity.service.PolicyService;
@Service
public class PolicyServiceImpl  implements PolicyService{
@Autowired
private PolicyRepository policyRepository;
	@Override
	public List<Policy> getAllPolicy() {
		List<Policy> list=policyRepository.findAll();
		return list;
	}

}
