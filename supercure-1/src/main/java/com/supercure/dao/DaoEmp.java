package com.supercure.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supercure.entity.Employee;

public interface DaoEmp extends JpaRepository<Employee, Long> {

	Employee getEmployeeByName(String name);
	
	Employee findEmployeeByMailAndPassw(String mobileNo, String passw);

	List<Employee> findEmployeeByCatagoryId(Long id);
	

}
