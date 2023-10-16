package com.velocity.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Premium;

@Repository
public interface PremiumRepository extends CrudRepository<Premium, Integer> {

}
