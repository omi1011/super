package com.supercure.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

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

public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private String contactNo;
	@OneToOne
	private Addresses address; // complete address with pin code
	private Date registerdDate; // when customer is joined i.e appointmentDate;
	private String customerType; // amc or non amc
	
	
	// below fields show only in get method not in post method 
	// below fields should filled autometically by programmer
	@Column(nullable = true, updatable = false)
	@CreatedDate
	private Date createdDate;
	@LastModifiedDate
	private Date updatedDate;
	@CreatedBy
	private String createdBy;
	@LastModifiedBy
	private String updatedBy;
	
	private Boolean isActive=true;

// just to know other another annotations
//	 @CreationTimestamp
//   private LocalDateTime createDateTime;
//	 
//	 @UpdateTimestamp
//	 private LocalDateTime updateDateTime;

//	private String Product;  // cctv, printer, computer,fridge, ac etc, this all should done by programmer 
//	@OneToMany
//	private List<Complaint> complaints; 
//	private Date openDate; // work start date
//	private Date closeDate; // work done date
//	private String workDetails; // which work and how much work is done by engineer
//	@OneToMany
//	List<Engineer> engineer;
//	private String paymentStatus;
//	private String paymentType; //like cash,check,gpay,phonepay,paytm,byBank,other
//	private String workStatus; // done,incomplete,inprogress, or just start

}
