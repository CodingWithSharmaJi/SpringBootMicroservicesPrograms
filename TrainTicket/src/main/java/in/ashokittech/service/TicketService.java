package in.ashokittech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokittech.dao.TicketRepository;
import in.ashokittech.request.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	public Ticket bookTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	public Ticket fetchTicket(Long fetch) {
		// TODO Auto-generated method stub
		Optional<Ticket> optionalTicket = ticketRepository.findById(fetch);
		Ticket ticket=null;
	    // Check if the ticket is present
	    if (optionalTicket.isPresent()) {
	        ticket= optionalTicket.get();
	    } 
	    return ticket;
	}
	
	public void deleteTicket(Long fetch) {
		// TODO Auto-generated method stub
		//Ticket ticket= ticketRepository.findById(fetch);
		//return ticketRepository.findById(fetch);
		 ticketRepository.deleteById(fetch);;
	}	
}
