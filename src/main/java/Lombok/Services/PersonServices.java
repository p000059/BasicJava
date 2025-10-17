package Lombok.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Lombok.ClassLombok.Person;
import Lombok.DTO.PersonDTO;
import Lombok.repository.PersonRepository;

public class PersonServices {

	@Autowired
	private PersonRepository iPersonRepository;
	
	public List<Person> getAllPerson(){
		
		return iPersonRepository.findAll(); 
	}
	
	public Person savePerson(Person objectPerson) {
		
		try {
			
			return iPersonRepository.save(objectPerson);
			
		} catch (Exception e) {

			return new PersonDTO();
		}
		
	}
	
	public Person getPerson(Person objectPerson) {
		
		return iPersonRepository.queryPersonByName(objectPerson.getFirstName());
		
	}
}
