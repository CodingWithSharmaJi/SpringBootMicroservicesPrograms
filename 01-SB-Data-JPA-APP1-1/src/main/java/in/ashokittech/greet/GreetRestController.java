package in.ashokittech.greet;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@GetMapping("/greet")
	public ResponseEntity<String> greetRestController() {
		
		String msg="Welcome Greet Rest";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
