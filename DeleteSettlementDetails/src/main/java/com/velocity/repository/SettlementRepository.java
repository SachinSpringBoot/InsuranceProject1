package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.SettlementDetails;

@Repository
public interface SettlementRepository extends CrudRepository<SettlementDetails, Serializable> {
public SettlementDetails findById(Integer id);
}
