package com.supercure.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supercure.configuration.ApisResponse;
import com.supercure.dto.TicketDto;
import com.supercure.entity.Ticket;
import com.supercure.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketResource {
	
	@Autowired
	TicketService serviceTicket;
	
	@PostMapping("/create")
	public ApisResponse createTicket(@RequestBody TicketDto d) {
		serviceTicket.createTicket(d);
		return new ApisResponse("Succesfully created ticket");
	} 
	
	@PutMapping("/update")
	public ApisResponse updateTicket(@RequestBody TicketDto d) {
		serviceTicket.updateTicket(d);
		return new ApisResponse("Succesfully updated ticket");
	}
	
	@DeleteMapping("/delete/id/{id}")
	public void deleteTicket(@PathVariable("id") Long id) {
		serviceTicket.deleteTicket(id);
		
	}
	
	@GetMapping("/allticket")
	public List<Ticket> getallTicket(){
		return serviceTicket.getallTicket();
	}
	
	@GetMapping("/byid/{id}")
	public TicketDto getTicketById(@PathVariable("id") Long id) {
		return  serviceTicket.getTicketById(id);
	}

	
}
