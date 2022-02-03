package com.supercure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class TechnicianSpeciality {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String speciality; // like cctv, computer hardware, fridge, ac, digital lock etc.
	
}
