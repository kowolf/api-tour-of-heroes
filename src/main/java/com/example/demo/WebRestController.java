package com.example.demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class WebRestController {
 
	@RequestMapping("/api/hi")
	public String hi() {
		return "Hello World from Tour Of Heros Restful API";
	}
	
	@RequestMapping("/api/test")
	public  ResponseEntity<Person> test() {
		Person person = new Person();
		person.setId(1);
		person.setName("Karl");
		person.setPhone("8015551234");
		
		ResponseEntity<Person> responseEntity = new ResponseEntity<>(person,
                HttpStatus.OK);
		
		return responseEntity;
	}
}