package com.velocity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.TrafficViolation;
import com.velocity.repository.TrafficViolationRepository;
import com.velocity.service.TrafficService;
@Service
public class TrafficViolationServiceImpl implements TrafficService {
     @Autowired  
	private TrafficViolationRepository trafficRepository;
	@Override
	public TrafficViolation saveTraffic(TrafficViolation trafficViolation) {
		
		return trafficRepository.save(trafficViolation);
	}

	@Override
	public List<TrafficViolation> getAllTrafficViolation() {
	return	trafficRepository.findAll();
		
	}

	@Override
	public TrafficViolation updateTrafficViolation(TrafficViolation trafficViolation) {
		
		return trafficRepository.save(trafficViolation);
	}

	@Override
	public void deleteTrafficViolation(Integer id) {
		trafficRepository.deleteById(id);
		
	}

}
