package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Student;
@Repository
public interface RepositoryCode extends JpaRepository<Student, Integer> {

}
