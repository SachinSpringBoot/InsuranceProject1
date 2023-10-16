package com.velocity.controller;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Premium;
import com.velocity.service.PremiumService;

@RestController
public class PremiumController {
	@Autowired
 private PremiumService premiumService;
	@PutMapping("/updatePremium")
	public Premium updatePremium(@RequestBody Premium premium) {
		Date date=Date.valueOf(LocalDate.now());
		premium.setPolicycommencementDate(date);
	Premium premium1=premiumService.updatePremium(premium);
	return premium1;
		
	}
}
