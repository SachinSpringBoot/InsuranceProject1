package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.ClaimDetails;
@Repository
public interface ClaimDetailsRepository extends JpaRepository<ClaimDetails, Integer>{

}
