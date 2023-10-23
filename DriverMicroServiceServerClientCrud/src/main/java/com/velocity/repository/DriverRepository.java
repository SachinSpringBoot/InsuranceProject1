package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Serializable> {
	public Driver findById(Integer id);
}
