package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.TrafficViolation;

@Repository
public interface TrafficViolationRepository extends JpaRepository<TrafficViolation, Serializable> {
public TrafficViolation findById(Integer id);
}
