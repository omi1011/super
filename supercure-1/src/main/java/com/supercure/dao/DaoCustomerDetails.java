package com.supercure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supercure.entity.CustomerDetails;

public interface DaoCustomerDetails extends JpaRepository< CustomerDetails, Long> {

	
	
	
}
