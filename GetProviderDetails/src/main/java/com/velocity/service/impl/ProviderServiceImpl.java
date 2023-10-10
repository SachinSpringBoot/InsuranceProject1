package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Provider;
import com.velocity.repository.ProviderRepository;
import com.velocity.service.ProviderService;

@Service
public class ProviderServiceImpl  implements ProviderService{
     @Autowired
	private ProviderRepository providerRepository;

	@Override
	public List<Provider> getAllProvider() {
		List<Provider> list=providerRepository.findAll();
		return list;
	}
}
