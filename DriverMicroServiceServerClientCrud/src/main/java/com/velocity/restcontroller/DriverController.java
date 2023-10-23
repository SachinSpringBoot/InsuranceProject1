package com.velocity.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Driver;
import com.velocity.server.DriverService;

@RestController
public class DriverController {
	@Autowired
	private DriverService driverService;

	@PostMapping("/saveDriver")
	public Driver saveDriver(@RequestBody Driver driver) {
		return driverService.saveDriver(driver);
	}

	@GetMapping("/getAllDriver")
	public List<Driver> getAllDriver() {
		return driverService.getAllDriver();
	}

	@PutMapping("/updateDriver")
	public Driver updateDriver(@RequestBody Driver driver) {
		return driverService.updateDriver(driver);
	}

	@DeleteMapping("/deleteDriver/{id}")
	public void deleteDriver(@PathVariable("id") Integer id) {
		driverService.deleteDriver(id);
	}
}
