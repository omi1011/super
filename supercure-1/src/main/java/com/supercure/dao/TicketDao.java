package com.supercure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supercure.entity.Ticket;

public interface TicketDao extends JpaRepository<Ticket, Long> {

	
	
}
