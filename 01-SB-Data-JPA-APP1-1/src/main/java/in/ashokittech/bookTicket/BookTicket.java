package in.ashokittech.bookTicket;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BookTicket {
	
	private Integer bookId;
	private String bookname;
	private Double bookprice;
	
	@XmlElement
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookname() {
		return bookname;
	} 
	public BookTicket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookTicket(Integer bookId, String bookname, Double bookprice) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.bookprice = bookprice;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Double getBookprice() {
		return bookprice;
	}
	@Override
	public String toString() {
		return "BookTicket [bookId=" + bookId + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}
	public void setBookprice(Double bookprice) {
		this.bookprice = bookprice;
	}

}
