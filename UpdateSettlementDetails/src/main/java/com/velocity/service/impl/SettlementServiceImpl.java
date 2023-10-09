package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.SettlementDetails;
import com.velocity.repository.SettlementRepository;
import com.velocity.service.SettlementService;

@Service
public class SettlementServiceImpl  implements SettlementService{
   @Autowired
	private SettlementRepository settle;
	@Override
	public SettlementDetails updateSettlement(SettlementDetails settlement) {
		SettlementDetails settlementlist=settle.save(settlement);
		return settlementlist;
	}

}
