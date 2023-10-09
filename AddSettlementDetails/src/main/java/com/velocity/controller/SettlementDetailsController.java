package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.SettlementDetails;
import com.velocity.service.SettlementService;

@RestController
public class SettlementDetailsController {
 @Autowired
	private SettlementService settlementService;
 @PostMapping("/saveSettlementDetails")
 public SettlementDetails saveSettlementDetails(@RequestBody SettlementDetails settlementDetails)
 {
	 SettlementDetails settle =settlementService.saveSettlementDetails(settlementDetails);
	return settle;
	 
 }
}
