package com.velocity.service;

import java.util.List;

import com.velocity.model.DriverDetails;

public interface DriverService {
public DriverDetails saveDriver(DriverDetails driverdetails);
public List<DriverDetails> getAll();
public DriverDetails updateDriverDetails(DriverDetails driverDetails);
public void deleteById(Integer id);
}
