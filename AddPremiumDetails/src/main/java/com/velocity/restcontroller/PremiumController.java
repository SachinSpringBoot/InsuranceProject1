package com.velocity.restcontroller;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Premium;
import com.velocity.service.PremiumService;

@RestController
public class PremiumController {
	@Autowired
	private PremiumService premiumservice;

	@PostMapping("/savePremium")
	public Premium savePremium(@RequestBody Premium premium) {
		Date date = Date.valueOf(LocalDate.now());
		premium.setPolicycommencementDate(date);
		Premium premium1 = premiumservice.savePremium(premium);
		return premium1;
	}
}
