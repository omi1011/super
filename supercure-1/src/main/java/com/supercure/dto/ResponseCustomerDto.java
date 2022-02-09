package com.supercure.dto;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

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


public class ResponseCustomerDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String customerFirstName;
	private String customerLastName;
	private String contactNo;
	private String mail;
	@OneToOne
	private Addresses address; // complete address with pin code
	private String registerdDate; // when customer is joined i.e appointmentDate;
	private String customerType; // amc or non amc
	
	@CreatedDate
	private LocalDate createdDate;
	@LastModifiedDate
	private LocalDate updatedDate;
	@CreatedBy
	private String createdBy;
	@LastModifiedBy
	private String updatedBy;


	
	
}
