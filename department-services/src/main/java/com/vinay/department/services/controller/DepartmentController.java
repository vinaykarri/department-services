package com.vinay.department.services.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.department.services.entity.Department;
import com.vinay.department.services.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/saveDept")
	public Department saveDepartment(@RequestBody Department department) {
		logger.info("Inside saveDepartment method of DepartmentController");

		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/getDept/{id}")
	public Department findDepartmnetById(@PathVariable ("id") Long departmentId) {
		logger.info("Inside findDepartmnetById method of DepartmentController");

		return departmentService.findDepartmentById(departmentId);
	}
}
