package com.supercure.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.supercure.entity.Bill;
import com.supercure.entity.Complaint;

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
	private Integer customerId;
	private String ticketId;
	private Boolean isActive;
	private LocalDateTime date;
	@OneToMany(cascade = CascadeType.ALL)		
	private List<Complaint> complaint;
	@OneToOne(cascade = CascadeType.ALL)
	private Bill bill;
	
	
}
