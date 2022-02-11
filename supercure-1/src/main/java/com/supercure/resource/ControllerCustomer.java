package com.supercure.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supercure.configuration.ApisResponse;
import com.supercure.dto.DtoCustomerDetails;
import com.supercure.entity.CustomerDetails;
import com.supercure.service.ServiceCustomer;

@RestController
@RequestMapping("/customer/")
public class ControllerCustomer {

	@Autowired
	ServiceCustomer service;

	ApisResponse response = new ApisResponse();
	@PostMapping("create")
	public ApisResponse createCustomer(@RequestBody DtoCustomerDetails customer) {
		service.addCustomer(customer);
		response.setMsg("Successfully created new customer ");
		return response;
	}
	
	@PostMapping("update")
	public ApisResponse updateCustomer(@RequestBody DtoCustomerDetails customer) {
		service.addCustomer (customer);
		response.setMsg("Successfully created new customer ");
		return response;
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteCustomer(@PathVariable("id") Long id) {
		service.deleteCustomerById(id);
	}
	
	@GetMapping("getcustomers")
	public List<CustomerDetails> getAllCustomer(){
		return service.getAllCustomer();
	}
	
	
}
