package in.ashokittech.bookrest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

	@GetMapping("/price/{isbn}")
	public ResponseEntity<String> getBook(@PathVariable("isbn") String isbn){
		String msg="";
		if(isbn.equalsIgnoreCase("ISBN001")) {
			msg= "BOOK PRICE IS 500$";
		}
		else if(isbn.equalsIgnoreCase("ISBN002")) {
			msg= "BOOK PRICE IS 100$";
		}
		else
			msg="Book is not available";
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
