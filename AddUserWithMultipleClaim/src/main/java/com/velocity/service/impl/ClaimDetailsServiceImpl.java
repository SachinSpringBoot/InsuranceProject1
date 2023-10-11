package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.ClaimDetails;
import com.velocity.repository.ClaimDetailsRepository;
import com.velocity.service.ClaimDetailsService;

@Service
public class ClaimDetailsServiceImpl implements ClaimDetailsService{
     @Autowired
	private ClaimDetailsRepository claimDetailsRepository;
	@Override
	public ClaimDetails saveClaimDetails(ClaimDetails claimDetails) {
		ClaimDetails  claimdetails=claimDetailsRepository.save(claimDetails);
		return claimdetails;
	}

}
