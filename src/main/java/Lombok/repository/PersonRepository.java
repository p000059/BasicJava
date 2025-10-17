package Lombok.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Lombok.ClassLombok.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {

	Page<Person> findAll(Pageable personPageable);

	@Query("SELECT p FROM Person p WHERE p.first_name = :name")
	Person queryPersonByName(@Param("name") String name);
	
}
