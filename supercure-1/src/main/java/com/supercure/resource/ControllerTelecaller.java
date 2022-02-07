package com.supercure.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supercure.configuration.DtoResponse;
import com.supercure.dto.DtoCustomerDetails;
import com.supercure.entity.CustomerDetails;
import com.supercure.service.ServiceTelecaller;

@RestController
@RequestMapping("/customer/")
public class ControllerTelecaller {

	@Autowired
	ServiceTelecaller service;

	DtoResponse response = new DtoResponse();
	@PostMapping("create")
	public DtoResponse createCustomer(@RequestBody DtoCustomerDetails customer) {
		service.addCustomer(customer);
		response.setMsg("Successfully created new customer ");
		return response;
	}
	
	@PostMapping("update")
	public DtoResponse updateCustomer(@RequestBody DtoCustomerDetails customer) {
		service.addCustomer (customer);
		response.setMsg("Successfully created new customer ");
		return response;
	}
	
	@DeleteMapping("delete")
	public void deleteCustomer(DtoCustomerDetails customer) {
		service.deleteCustomer(customer);
	}
	
	@GetMapping("getcustomers")
	public List<CustomerDetails> getAllCustomer(){
		return service.getAllCustomer();
	}
	
	
}
