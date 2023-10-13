package com.velocity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Claim;
@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer>{
public List<Claim> findByUserId(Integer id);
 }
