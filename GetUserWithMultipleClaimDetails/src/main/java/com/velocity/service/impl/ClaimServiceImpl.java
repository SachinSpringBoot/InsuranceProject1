package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Claim;
import com.velocity.repository.ClaimRepository;
import com.velocity.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {
      @Autowired
	private ClaimRepository claimRepository;

	@Override
	public List<Claim> getClaimListById(Integer id) {
		List<Claim> list=claimRepository.findByUserId(id);
		return list;
	}
	

}
