package com.brillio.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.brillio.binding.Ticket;

public class XmlToJavaConverter {
        

		public static void main(String[] args) throws JAXBException {
        	
        	JAXBContext jaxbContext = JAXBContext.newInstance(Ticket.class);
        	Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        	
        	File xmlfile=new File("ticket.xml");
        	Ticket ticket=(Ticket)unmarshaller.unmarshal(xmlfile);
        	
        	System.out.println(ticket);
        	System.out.println(ticket.getFrom());
			
		}
}
