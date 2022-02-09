
package com.supercure.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supercure.configuration.ApisResponse;
import com.supercure.dto.DtoEmp;
import com.supercure.dto.LoginDto;
import com.supercure.dto.ResponseDto;
import com.supercure.entity.Employee;
import com.supercure.service.ServiceEmp;
import com.supercure.utility.UserNotFoundException;
// 1. register employee
// 2. get all Employee
// 3. soft delete Employee
// 4. get deleted employee
// 5. login api 
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/employee/")
public class ResourceEmp {
	
	
	
	@Autowired
	ServiceEmp service;
	@PostMapping("register")
	public ApisResponse registerEmployee(@RequestBody DtoEmp emp) {
//		if(!emp.getPassw().equalsIgnoreCase(emp.getConfirmPassw())) {
//			throw new RuntimeException("pass does not match");}
		ApisResponse response = new ApisResponse();
		service.createEmp(emp);
		response.setMsg("Successfully registerd");
		return response;
	}
	

	@PostMapping("login")
	public String loginEmployee(@RequestBody LoginDto login) {
		String empBy = service.getEmpByMailAndPassw(login.getMail(), login.getPassw());
		return empBy;
	
	}
	
	@GetMapping("allemployee")
	public List<Employee> getAllemployee(){
		return service.getAllEmp();
	}
	
	
	// soft delete employee
	@DeleteMapping("delete/{id}")
	public void deleteEmployee(@PathVariable("id") Long id){
		service.deleteEmpById(id);
	}
	
	@PutMapping("update/employee")
	public String updateEmployee(@RequestBody DtoEmp emp) {
//		if(!emp.getPassw().equalsIgnoreCase(emp.getConfirmPassw())) {
//			throw new RuntimeException("pass does not match");
//		}
		service.updateEmp(emp);
		return "Successfully registerd";
	}
	
	// for by catagory id
		// get employee by catagory id
	@GetMapping("catagoryId/{id}")
	public List<Employee> getEmployeesByCatagoryId(Long catagoryId){
		return service.getEmployeesByCatagoryId(catagoryId);
		}

	@GetMapping("getby/{id}")
	public Employee getById(@PathVariable("id") Long id) {
		return service.getEmpById(id); // does not give exception why
	}

	@GetMapping("getname/{name}")
	public Employee getByName(@PathVariable("name") String name) {
		Employee byName = service.getByName(name);
		if (byName==null) {
			throw new UserNotFoundException("user with name " +name +" is not available ");
		}
		return service.getByName(name);
	}
	
	@GetMapping("deleted/employee")
	public List<Employee> deletedemployee(){
		return service.getDeletedEmployee();
	}

	
}
