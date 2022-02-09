package com.supercure.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.tomcat.jni.Address;

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
public class TicketDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String complaint;
	private String createdBy;
	private Date createdOn;
	
}
