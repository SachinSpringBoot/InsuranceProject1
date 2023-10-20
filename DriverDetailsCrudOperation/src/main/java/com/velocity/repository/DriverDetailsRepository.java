package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.DriverDetails;

@Repository
public interface DriverDetailsRepository  extends JpaRepository<DriverDetails, Serializable>{
public DriverDetails findById(Integer id);
}
