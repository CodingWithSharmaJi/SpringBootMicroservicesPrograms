package in.ashokittech.customer;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
	private Integer id;
	private String email;
	private String name;
	public Customer(Integer id, String email, String name) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@XmlElement
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", name=" + name + "]";
	}

}
