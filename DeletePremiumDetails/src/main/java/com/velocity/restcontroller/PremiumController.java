package com.velocity.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.service.PremiumService;

@RestController
public class PremiumController {
	@Autowired
private PremiumService premiumService;
	@DeleteMapping("/deletePremiumService/{id}")
	public void deletePremiumService(@PathVariable("id") Integer id) {
		premiumService.deletePremiumService(id);
	}
}
