package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Serializable> {
public Bill findById(Integer id);
}
