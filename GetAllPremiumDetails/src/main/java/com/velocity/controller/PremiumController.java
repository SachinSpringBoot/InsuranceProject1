package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Premium;
import com.velocity.service.PremiumService;

@RestController
public class PremiumController {
     @Autowired
	private PremiumService premiumService;
     @GetMapping("/getAllPremium")
     public List<Premium> getAllPremium(){
    	List<Premium> list =premiumService.getAllPremium();
    	return list;
     }
}
