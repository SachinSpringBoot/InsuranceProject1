package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Provider;
import com.velocity.repository.ProviderRepository;
import com.velocity.service.ProviderService;
@Service
public class ProviderServiceImpl implements ProviderService {
   @Autowired
	private ProviderRepository providerRepository;
	@Override
	public Provider saveProvider(Provider provider) {
		Provider provider1=providerRepository.save(provider);
		return provider1;
	}

}
