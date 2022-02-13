package com.supercure.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.supercure.entity.Addresses;
import com.supercure.entity.Ticket;

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
	private String mail;

	@OneToOne(cascade = CascadeType.ALL)
	private Addresses address; // complete address with pin code
	private String registerdDate; // when customer is joined i.e appointmentDate;
	private String customerType; // amc or non amc
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Ticket> tickets;

	
}
