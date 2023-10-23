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

import com.velocity.model.TrafficViolation;
import com.velocity.service.TrafficService;

@RestController
public class TrafficViolationController {
@Autowired	
private TrafficService  trafficService;
@PostMapping("/saveTraffic")
public TrafficViolation saveTraffic(@RequestBody  TrafficViolation trafficViolation) {
return	trafficService.saveTraffic(trafficViolation);
}
@GetMapping("/getAllTrafficViolation")
public List<TrafficViolation> getAllTrafficViolation(){
return	trafficService.getAllTrafficViolation();
}
@PutMapping("/updateTrafficViolation")
public TrafficViolation updateTrafficViolation(@RequestBody  TrafficViolation trafficViolation) {
return	trafficService.updateTrafficViolation(trafficViolation);
}
@DeleteMapping("/deleteTraffic/{id}")
public void deleteTrafficViolation(@PathVariable("id")  Integer id) {
	trafficService.deleteTrafficViolation(id);
}



}
