package com.example.demo.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;



@RestController
@RequestMapping("/departments")

public class DepartmentController {
	private static final Logger LOGGER=Logger.getLogger(DepartmentController.class.getName());
	@Autowired
	private DepartmentService departmentService;
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
	LOGGER.info("inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		LOGGER.info("finddepartmentbyId method of departmentcontroller");
		return departmentService.findDepartmentById(departmentId);
		
	}

}
