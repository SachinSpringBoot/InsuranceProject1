package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Settlement;

@Repository
public interface SettlementClientRepository extends JpaRepository<Settlement, Serializable> {

}
