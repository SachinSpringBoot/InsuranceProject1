package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.SettlementDetails;
import com.velocity.service.SettlementService;

@RestController
public class SettlementController {
	@Autowired
private SettlementService settlementService;
	@PutMapping("/updateSettlement")
	public SettlementDetails updateSettlement(@RequestBody  SettlementDetails settlement) {
		SettlementDetails	settlement1	=settlementService.updateSettlement(settlement);
		return settlement1;
	}

}
