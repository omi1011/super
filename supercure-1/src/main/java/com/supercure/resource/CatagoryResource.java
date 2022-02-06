package com.supercure.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supercure.entity.Catagory;
import com.supercure.service.ServiceCatagorty;

@RestController
public class CatagoryResource {

	
	@Autowired
	ServiceCatagorty service;
	@PostMapping("/catagory")
	public Catagory createCatagory(Catagory cat) {
		return service.createcata(cat);
	}
	
	@GetMapping("/catagories")
	public List<Catagory> getAllCatagory() {
		return service.getAllCatagory();
	}
	
	@GetMapping("/catagory/catagorId/{id}")
	public Catagory getCatagoryById(@PathVariable("id") Long id) {
		return service.getCatagoryById(id);
	}
	
}
