package com.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Provider;
import com.velocity.service.ProviderService;

@RestController
public class ProviderController {
	@Autowired
private ProviderService providerService;
	@GetMapping("/getAllProvider")
	public List<Provider> getAllProvider(){
	  List<Provider> list=providerService.getAllProvider();
		return list;
	}

}
