package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.SettlementDetails;
@Repository
public interface SettlementDetailsRepository extends JpaRepository<SettlementDetails, Integer> {

}
