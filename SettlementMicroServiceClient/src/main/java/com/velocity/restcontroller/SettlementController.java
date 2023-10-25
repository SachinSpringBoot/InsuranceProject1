package com.velocity.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Settlement;
import com.velocity.service.SettlementService;

@RestController
public class SettlementController {
	@Autowired
private SettlementService settlementService;
	@PostMapping("/saveSettlement")
	public Settlement saveSettlement(@RequestBody  Settlement settlement) {
		return settlementService.saveSettlement(settlement);
	}
}
