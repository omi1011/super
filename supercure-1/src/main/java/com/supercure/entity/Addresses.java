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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Addresses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String state;
	private String dist;
	private String city;
	private String pincode;
	private String landmark; // here can use landmark like house no.
	
}
