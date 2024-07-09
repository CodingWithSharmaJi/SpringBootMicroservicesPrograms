package in.ashokittech.customerRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokittech.customer.Customer;

@RestController
public class CustomerRestController {
	
	@PostMapping(value="/customerdetail",
			consumes = {"application/xml","application/json"}
	)
	public ResponseEntity<String> addCustomerDetails(@RequestBody Customer customer){
		String msg=null;
		System.out.println(customer);
		msg="Record Inserted Successfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);

		
	}

}
