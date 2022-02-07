package com.supercure.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supercure.dao.DaoCustomerDetails;
import com.supercure.dto.DtoCustomerDetails;
import com.supercure.entity.CustomerDetails;

@Service
public class ServiceTelecaller {

	@Autowired
	DaoCustomerDetails repo;
	
	
	ModelMapper modelMapper = new ModelMapper();
	
	public DtoCustomerDetails addCustomer(DtoCustomerDetails customer) {
		CustomerDetails mapCustomer = modelMapper.map(customer, CustomerDetails.class);
		mapCustomer.setIsActive(true);
		CustomerDetails savedCustomer = repo.save(mapCustomer);
		DtoCustomerDetails dtoCustom = modelMapper.map(savedCustomer, DtoCustomerDetails.class);
		return dtoCustom;
	}
	
	// customer updation
	public DtoCustomerDetails updateCustomer(DtoCustomerDetails customer) {
		CustomerDetails mapCustomer = modelMapper.map(customer, CustomerDetails.class);
		CustomerDetails savedCustomer = repo.save(mapCustomer);
		DtoCustomerDetails dtoCustom = modelMapper.map(savedCustomer, DtoCustomerDetails.class);
		return dtoCustom;
	}
	
	public void deleteCustomer(DtoCustomerDetails customer) {
		CustomerDetails map = modelMapper.map(customer, CustomerDetails.class);
		map.setIsActive(false);
	}
	
	public List<CustomerDetails> getAllCustomer(){
		List<CustomerDetails> findAll = repo.findAll();
		List<CustomerDetails> collect = findAll.stream()
						.filter((cus)->cus.getIsActive()==true)
						.collect(Collectors.toList());
		return collect;
	}
}