package com.supercure.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supercure.dao.TicketDao;
import com.supercure.dto.TicketDto;
import com.supercure.entity.Ticket;
import com.supercure.utility.UserNotFoundException;

@Service
public class TicketService {

	ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	TicketDao ticketRepo;
	
	public TicketDto createTicket(TicketDto d) {
		
		Ticket mapTicket = modelMapper.map(d, Ticket.class);
		Ticket saveTicket = ticketRepo.save(mapTicket);
		TicketDto mappedTicket = modelMapper.map(saveTicket, TicketDto.class);
		return mappedTicket;
	} 
	
	public TicketDto updateTicket(TicketDto d) {
		ModelMapper modelMapper = new ModelMapper();
		Ticket mapTicket = modelMapper.map(d, Ticket.class);
		Ticket saveTicket = ticketRepo.save(mapTicket);
		TicketDto mappedTicket = modelMapper.map(saveTicket, TicketDto.class);
		return mappedTicket;
	}
	
	public void deleteTicket(Long id) {
		Optional<Ticket> findById = ticketRepo.findById(id);
		findById.ifPresent((ticket)-> ticket.setIsActive(false));
		findById.orElseThrow(()-> new UserNotFoundException("wrong id "+ id));
		
	}
	
	public List<Ticket> getallTicket(){
//		List<Ticket> findAll = ticketRepo.findAll();
//		ModelMapper mapper= new ModelMapper();
//		TicketDto map = mapper.map(findAll, TicketDto.class);
//		for (TicketDto dto:map.) {		
//		}
		return ticketRepo.findAll();
	}
	
	public TicketDto getTicketById(Long id) {
		Ticket ticket = ticketRepo.findById(id).get();
		TicketDto mappedDto = modelMapper.map(ticket, TicketDto.class);
		return  mappedDto;
	}
	
}
