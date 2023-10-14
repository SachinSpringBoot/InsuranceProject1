package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.service.SettlementService;

@RestController
public class SettlementController {
	@Autowired
private SettlementService settlementService;
	@DeleteMapping("/deleteSettlement/{id}")
	public void deleteSettlement(@PathVariable("id") Integer id) {
		settlementService.deleteSettlement(id);
	}
}
