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

import com.velocity.model.DriverDetails;
import com.velocity.service.DriverService;

@RestController
public class DriverDetailController {
	@Autowired
	private DriverService driverService;

	@PostMapping("/saveDriver")
	public DriverDetails saveDriver(@RequestBody DriverDetails driverdetails) {
		return driverService.saveDriver(driverdetails);

	}

	@GetMapping("/getAll")
	public List<DriverDetails> getAll() {
		return driverService.getAll();
	}

	@PutMapping("/updateDriverDetails")
	public DriverDetails updateDriverDetails(@RequestBody DriverDetails driverDetails) {
		return driverService.updateDriverDetails(driverDetails);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id")   Integer id) {
		driverService.deleteById(id);
}}
