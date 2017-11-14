package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@RequestMapping("/api/hello")
	public String hi() {
		return "Hello World from Tour Of Heros Restful API";
	}

	@RequestMapping(value="/api/hero", method = RequestMethod.GET)
	public ResponseEntity<List<Hero>> getHeroList() {
		Hero hero1 = new Hero();
		hero1.setId(1);
		hero1.setName("Karl");
		
		Hero hero2 = new Hero();
		hero2.setId(2);
		hero2.setName("Wendy");
		
		List <Hero> heroList = new ArrayList<>();
		
		heroList.add(hero1);
		heroList.add(hero2);
		
		ResponseEntity<List<Hero>> responseEntity = new ResponseEntity<>(heroList, HttpStatus.OK);

		return responseEntity;
	}
	
	@RequestMapping(value="/api/hero/{id}", method = RequestMethod.GET)
	public ResponseEntity<Hero> getHero(@PathVariable Integer id) {
		Hero hero1 = new Hero();
		hero1.setId(1);
		hero1.setName("Karl");
		
		Hero hero2 = new Hero();
		hero2.setId(2);
		hero2.setName("Wendy");
		
		Hero result = null;
		
		if (id == 1) {
			result = hero1;
		} else if (id == 2) {
			result = hero2;
		}
		
		ResponseEntity<Hero> responseEntity = new ResponseEntity<>(result, HttpStatus.OK);
		return responseEntity;  
	}

}