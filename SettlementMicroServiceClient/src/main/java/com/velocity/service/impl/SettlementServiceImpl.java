package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Settlement;
import com.velocity.repository.SettlementClientRepository;
import com.velocity.service.SettlementService;
@Service
public class SettlementServiceImpl implements SettlementService {
     @Autowired
	private SettlementClientRepository settlementRepository;
	@Override
	public Settlement saveSettlement(Settlement settlement) {
		return settlementRepository.save(settlement);
	}

}
