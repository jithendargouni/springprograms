package com.Sathya.ORM.Person.Mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.Sathya.ORM.Person.Entity.Person;
import com.Sathya.ORM.Person.Model.PersonDetails;

@Component
public class PersonMapper {
	
	

	public Person modelToEntityConversion(PersonDetails personDetails) {
		
		Person person = new Person();
		
		person.setPersonid(personDetails.getPersonid());
		person.setFirstname(personDetails.getFirstname());
		person.setLastname(personDetails.getLastname());
		person.setEmail(personDetails.getEmail());
		person.setAge(personDetails.getAge());
		person.setCreateAt(LocalDateTime.now());
		person.setCreateBy(System.getProperty("user.name"));
		
		return person;
	}

	public List<Person> modelToEntityListConversion(List<PersonDetails> persons) {
		
		
		List<Person> persons2 = new ArrayList<Person>();
		
		for(PersonDetails perDetails:persons)
		{
			Person person = new Person();
			
			person.setPersonid(perDetails.getPersonid());
			person.setFirstname(perDetails.getFirstname());
			person.setLastname(perDetails.getLastname());
			person.setEmail(perDetails.getEmail());
			person.setAge(perDetails.getAge());
			person.setCreateAt(LocalDateTime.now());
			person.setCreateBy(System.getProperty("user.name"));
			
			persons2.add(person);
		}
		
		return persons2;
	}
	

}
