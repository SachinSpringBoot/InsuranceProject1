package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Serializable>{
public Policy findBypolicyId(Integer policyId);
}
