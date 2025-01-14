package com.brillio.binding;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.brillio.Passenger.Passenger;

import java.io.*;


public class JavaToXmlConverter {

	public static void main(String[] args) throws JAXBException {
		
		Passenger passenger=new Passenger();
		passenger.setFname("Raju");
		passenger.setLname("Kumar");
		passenger.setPhnno(9865432l);
		
		
		Ticket ticket=new Ticket();
		ticket.setId(101);
		ticket.setFrom("Jaipur");
		ticket.setTo("Gandhinagar");
		ticket.setStatus("Approved");
		ticket.setPrice(25880d);
		ticket.setProvider("Indigo");
		
	
		ticket.setPassenger(passenger);
		//Converting java object to xml using JAXB
		
		//Creating instance for JAXB context
		JAXBContext jaxbContext = JAXBContext.newInstance(Ticket.class);
        
		//Getting Marshaller object(Marshaller created)
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		//Performing Marshalling
		marshaller.marshal(ticket, new File("ticket.xml"));
		System.out.println("Marshalling performed");

	}

}
