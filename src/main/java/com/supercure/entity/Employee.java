package com.supercure.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Employee {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private Long id;
	private String name;
	private String emailId;
	private String phoneNo;
	
	@OneToOne
	private EmpRole roll;
	
	@OneToMany
	private List<TechnicianSpeciality> speciality;
	
	

}
