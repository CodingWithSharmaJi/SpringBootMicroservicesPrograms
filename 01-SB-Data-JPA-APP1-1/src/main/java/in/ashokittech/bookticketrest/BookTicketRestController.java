package in.ashokittech.bookticketrest;



import javax.print.attribute.standard.Media;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokittech.bookTicket.BookTicket;

@RestController
public class BookTicketRestController {

	@GetMapping(value="/book",
			produces = {
				MediaType.APPLICATION_XML_VALUE,
				MediaType.APPLICATION_JSON_VALUE
			})
	public ResponseEntity<BookTicket> getbook(){
		BookTicket book=new BookTicket(101,"SBMS",2900D);
		return new ResponseEntity<BookTicket>(book,HttpStatus.OK);
		
	}
}
