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
public class Engineer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String engineerName;  
	/* at hear at front end it should show list of 
	engineer then telecaller will select it from there
	there should be at least more than one block to select multiple engineer
	*/
}
