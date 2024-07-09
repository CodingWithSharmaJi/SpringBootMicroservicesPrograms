package com.brillio.Passenger;

public class Passenger {
	private String fname;
	private String lname;
	private Long phnno;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	@Override
	public String toString() {
		return "Passenger [fname=" + fname + ", lname=" + lname + ", phnno=" + phnno + "]";
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Long getPhnno() {
		return phnno;
	}
	public void setPhnno(Long phnno) {
		this.phnno = phnno;
	}
}
