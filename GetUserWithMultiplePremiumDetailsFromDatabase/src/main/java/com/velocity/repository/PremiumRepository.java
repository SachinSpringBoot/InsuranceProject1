package com.velocity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Premium;

@Repository
public interface PremiumRepository extends JpaRepository<Premium, Integer> {
public List<Premium> findByUserId(Integer userId);
}
