package com.vinay.department.services.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinay.department.services.entity.Department;
import com.vinay.department.services.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepo;
	
	Logger logger = LoggerFactory.getLogger(DepartmentService.class);
	
	public Department saveDepartment(Department department) {
		
		logger.info("Inside saveDepartment method of DepartmentService");

		return departmentRepo.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		logger.info("Inside findDepartmnetById method of DepartmentService");
		return departmentRepo.findByDepartmentId(departmentId);
	}
}
