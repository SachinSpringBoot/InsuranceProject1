package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Student;
import com.velocity.repository.RepositoryCode;
import com.velocity.service.ServiceCode;
@Service
public class ServiceImpl implements ServiceCode{
	@Autowired
private RepositoryCode repositoryCode;
	@Override
	public Student MethodName(Student student) {
	Student student1=repositoryCode.save(student);
		return student1;
	}

}
