package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.repository.SettlementRepository;
import com.velocity.service.SettlementService;

@Service
public class SettlementServiceImpl implements SettlementService{
    @Autowired
	private SettlementRepository settlementRepository;
	@Override
	public void deleteSettlement(Integer id) {
		settlementRepository.deleteById(id);
		
	}

}
