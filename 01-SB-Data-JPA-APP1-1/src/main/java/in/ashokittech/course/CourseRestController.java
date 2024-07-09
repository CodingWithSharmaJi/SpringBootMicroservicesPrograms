package in.ashokittech.course;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {
	
	@GetMapping("/info")
	public ResponseEntity<String> getCourse
	(
			@RequestParam("cname") String cname,
	        @RequestParam("tname") String tname
	 ){
		String responsemsg="";
		
		if(cname.equalsIgnoreCase("SpringBoot")&&tname.equalsIgnoreCase("Ashok")) {
			responsemsg="New Batch of "+cname+" of "+tname+" will start In a week";
		}
		else
		{
			responsemsg="No Information Available about the course";
		}
			
		return new ResponseEntity<>(responsemsg,HttpStatus.OK);
		
		
	  }

}
