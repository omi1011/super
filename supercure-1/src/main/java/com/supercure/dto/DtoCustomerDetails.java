package com.supercure.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.supercure.entity.Addresses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class DtoCustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String customerFirstName;
	private String customerLastName;
	private String contactNo;
	@OneToOne
	private Addresses address; // complete address with pin code
	private String registerdDate; // when customer is joined i.e appointmentDate;
	private String customerType; // amc or non amc

	
}