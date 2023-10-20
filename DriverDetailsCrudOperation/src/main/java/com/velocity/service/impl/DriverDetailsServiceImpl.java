package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.DriverDetails;
import com.velocity.repository.DriverDetailsRepository;
import com.velocity.service.DriverService;

@Service
public class DriverDetailsServiceImpl implements DriverService {
	@Autowired
	private DriverDetailsRepository driverRepository;

	@Override
	public DriverDetails saveDriver(DriverDetails driverdetails) {

		return driverRepository.save(driverdetails);
	}

	@Override
	public List<DriverDetails> getAll() {
		return driverRepository.findAll();
	}

	@Override
	public DriverDetails updateDriverDetails(DriverDetails driverDetails) {
		return driverRepository.save(driverDetails);
	}

	@Override
	public void deleteById(Integer id) {
		driverRepository.deleteById(id);		
	}

}
