package com.supercure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supercure.dto.DtoEmp;
import com.supercure.dto.LoginDto;
import com.supercure.entity.Employee;

@Service
public class LoginService {

	@Autowired
	DtoEmp repo;
	
	@Autowired
	Employee emp;
	
	public String loginEmp(LoginDto login) {
		
		
		
		return null;
	}
}
