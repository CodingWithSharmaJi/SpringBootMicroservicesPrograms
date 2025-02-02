package com.brillio.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.brillio.Passenger.Passenger;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ticket {
	
	public static Object xml;
	private Integer Id;
	private String status;
	private String from;
	private String to;
	private Double price;
	
	@XmlAttribute
	private String provider;
	
	private Passenger passenger;
	public static Object getXml() {
		return xml;
	}
	@Override
	public String toString() {
		return "Ticket [Id=" + Id + ", status=" + status + ", from=" + from + ", to=" + to + ", price=" + price
				+ ", provider=" + provider + ", passenger=" + passenger + "]";
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public static void setXml(Object xml) {
		Ticket.xml = xml;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	

}
