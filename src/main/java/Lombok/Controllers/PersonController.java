package Lombok.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Lombok.ClassLombok.Person;
import Lombok.DTO.PersonDTO;
import Lombok.Services.PersonServices;

@RequestMapping(value = "/person")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class PersonController {

	@Autowired
	private PersonServices personServices;
	
	@GetMapping(value = "/getperson")
	public List<Person> readPerson() {
		
		try {
						
			
			return personServices.getAllPerson();			
			
		} catch (Exception e) {

			return new ArrayList<>();
		}		
	}
	
	@PostMapping(value = "/saveperson")
	public Person save(Person person) {
		
		try {
			
			return personServices.getPerson(person);
			
		} catch (Exception e) {

			return new PersonDTO();
		}
	}
}
