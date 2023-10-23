package com.velocity.service;

import java.util.List;

import com.velocity.model.TrafficViolation;

public interface TrafficService {
public TrafficViolation saveTraffic(TrafficViolation trafficViolation);
public List<TrafficViolation> getAllTrafficViolation();
public TrafficViolation updateTrafficViolation(TrafficViolation trafficViolation);
public void deleteTrafficViolation(Integer id);
}
