package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepo;

@Service
public class DepartmentService {
	@Autowired
private DepartmentRepo departmentRepo;
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}
	public Department findDepartmentById(Long departmentId) {
		return departmentRepo.findByDepartmentId(departmentId);
	}
		
}
