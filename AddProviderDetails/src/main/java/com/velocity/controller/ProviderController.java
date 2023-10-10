package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Provider;
import com.velocity.service.ProviderService;

@RestController
public class ProviderController {
    @Autowired
	private ProviderService providerService;
    @PostMapping("/saveProvider")
    public Provider saveProvider(@RequestBody Provider provider) {
    	Provider provider1 	=providerService.saveProvider(provider);
    	return provider1;
    	
    }
}
