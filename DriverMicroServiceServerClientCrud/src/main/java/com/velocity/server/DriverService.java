package com.velocity.server;

import java.util.List;

import com.velocity.model.Driver;

public interface DriverService {
	public Driver saveDriver(Driver driver);

	public List<Driver> getAllDriver();

	public Driver updateDriver(Driver driver);

	public void deleteDriver(Integer id);
}
