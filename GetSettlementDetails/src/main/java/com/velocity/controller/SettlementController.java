package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.SettlementDetails;
import com.velocity.service.SettlementService;

@RestController
public class SettlementController {
	@Autowired
private SettlementService settlementService;
	@GetMapping("/getSettlementDetails")
	public List<SettlementDetails> getSettlementDetails(){
		List<SettlementDetails> list=settlementService.getSettlementDetails();
		return list;
	}

}
