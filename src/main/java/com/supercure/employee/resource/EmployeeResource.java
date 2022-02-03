package com.supercure.employee.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supercure.entity.Employee;

@RestController
@RequestMapping("/supercure/employee")
public class EmployeeResource {

	public Employee addEmployee(Employee emp) {
		return null;
	}
	
}
