package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Driver;
import com.velocity.repository.DriverRepository;
import com.velocity.server.DriverService;

@Service
public class DriverServiceImpl implements DriverService {
	@Autowired
	private DriverRepository driverRepository;

	@Override
	public Driver saveDriver(Driver driver) {

		return driverRepository.save(driver);
	}

	@Override
	public List<Driver> getAllDriver() {
		return driverRepository.findAll();
	}

	@Override
	public Driver updateDriver(Driver driver) {
		return driverRepository.save(driver);
	}

	@Override
	public void deleteDriver(Integer id) {
		driverRepository.deleteById(id);

	}

}
