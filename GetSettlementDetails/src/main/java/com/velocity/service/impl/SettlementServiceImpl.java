package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.SettlementDetails;
import com.velocity.repository.SettlementDetailsRepository;
import com.velocity.service.SettlementService;

@Service
public class SettlementServiceImpl  implements SettlementService{
   @Autowired
	private SettlementDetailsRepository settlementRepository;
	@Override
	public List<SettlementDetails> getSettlementDetails() {
	List<SettlementDetails>	 list=settlementRepository.findAll();
		return list;
	}

}
