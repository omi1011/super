package com.supercure.dto;

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

public class AddressDto {
	
		private Long id;
		private String state;
		private String dist;
		private String city;
		private String pincode;
		private String landmark; // here can use landmark like house no.
		


	
}
