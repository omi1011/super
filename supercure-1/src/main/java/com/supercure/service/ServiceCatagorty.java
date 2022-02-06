package com.supercure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supercure.dao.DaoCatagory;
import com.supercure.entity.Catagory;
import com.supercure.utility.UserNotFoundException;

@Service
public class ServiceCatagorty {

	@Autowired
	DaoCatagory repo;
	public Catagory createcata(Catagory cat) {
		return repo.save(cat);
	}
	
	public List<Catagory> getAllCatagory(){
		return repo.findAll();
	}
	
	public Catagory getCatagoryById(Long id) {
		return repo.findById(id).
		orElseThrow(()->new UserNotFoundException("the given user is not available id " +id));
	}

}
