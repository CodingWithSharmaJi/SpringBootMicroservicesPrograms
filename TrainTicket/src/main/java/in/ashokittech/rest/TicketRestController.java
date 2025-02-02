package in.ashokittech.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.MediaType;


import org.springframework.http.ResponseEntity;

import in.ashokittech.request.Ticket;
import in.ashokittech.service.TicketService;


@RestController
public class TicketRestController {
	
	@Autowired
	private TicketService ticketservice;
	
	@PostMapping(value = "/book",
		produces= {
					MediaType.APPLICATION_XML_VALUE,
     				MediaType.APPLICATION_JSON_VALUE
			}
	)
	public ResponseEntity<Ticket> bookTicket(@RequestBody Ticket ticket)
	{
		Ticket bookedTicket=ticketservice.bookTicket(ticket);
		return new ResponseEntity<Ticket>(bookedTicket,HttpStatus.ACCEPTED);
	}
	

	
	@DeleteMapping("/tickdelete/{delete}")
	public ResponseEntity<String> deleteTicket(@PathVariable("delete") Long delete)
	{
		String msg="";
		ticketservice.deleteTicket(delete);
		msg="Deleted Successfully";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/ticket/{fetch}")
	public ResponseEntity<Ticket> fetchTicket(@PathVariable("fetch") Long fetch)
	{
		Ticket bookedTicket=ticketservice.fetchTicket(fetch);
		return new ResponseEntity<>(bookedTicket,HttpStatus.OK);
	}
}
