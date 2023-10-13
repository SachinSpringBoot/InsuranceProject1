package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Premium;
import com.velocity.repository.PremiumRepository;
import com.velocity.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {
    @Autowired
	private PremiumRepository premiumRepository;
	@Override
	public List<Premium> getPremiumByUserId(Integer userId) {
	List<Premium> list=premiumRepository.findByUserId(userId);
		return list;
	}

}
