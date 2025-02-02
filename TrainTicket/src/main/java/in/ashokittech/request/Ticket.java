package in.ashokittech.request;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Ticket {

	private String passengername;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_seq")
    @SequenceGenerator(name = "ticket_seq", sequenceName = "TICKET_SEQ", allocationSize = 1)
	private Long ID;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String passengeremail;
	private Long passengermobno;
	private String source;
	private String destination;
	private String journeydate;
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getPassengeremail() {
		return passengeremail;
	}
	public void setPassengeremail(String passengeremail) {
		this.passengeremail = passengeremail;
	}
	public Long getPassengermobno() {
		return passengermobno;
	}
	public void setPassengermobno(Long passengermobno) {
		this.passengermobno = passengermobno;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getJourneydate() {
		return journeydate;
	}
	public void setJourneydate(String journeydate) {
		this.journeydate = journeydate;
	}
	
	public Ticket(String passengername, Long iD, String passengeremail, Long passengermobno, String source,
			String destination, String journeydate) {
		super();
		this.passengername = passengername;
		ID = iD;
		this.passengeremail = passengeremail;
		this.passengermobno = passengermobno;
		this.source = source;
		this.destination = destination;
		this.journeydate = journeydate;
	}
	@Override
	public String toString() {
		return "Ticket [passengername=" + passengername + ", ID=" + ID + ", passengeremail=" + passengeremail
				+ ", passengermobno=" + passengermobno + ", source=" + source + ", destination=" + destination
				+ ", journeydate=" + journeydate + "]";
	}
}