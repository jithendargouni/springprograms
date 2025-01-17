package com.Sathya.ORM.Person.Mapper;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Sathya.ORM.Person.Entity.Person;
import com.Sathya.ORM.Person.Model.PersonDetails;
import com.Sathya.ORM.Person.Repository.PersonRepository;

@Component
public class PersonClient  implements CommandLineRunner{
	
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	PersonMapper mapper;
	
	@Override
	public void run(String... args) throws Exception {
		
		//model class data : having the values
     PersonDetails personDetails = new PersonDetails();
     
     personDetails.setPersonid(101);
     personDetails.setFirstname("jithendar");
     personDetails.setLastname("gouni");
     personDetails.setEmail("jithu@gmail.com");
     personDetails.setAge(23);
     
		//conversion of model class data to entity
     Person person = mapper.modelToEntityConversion(personDetails);
     
     personRepository.save(person);
     
	
	
	PersonDetails p = new PersonDetails();
	 
	p.setPersonid(102);
    p.setFirstname("pavan");
    p.setLastname("akula");
    p.setEmail("pavan@gmail.com");
    p.setAge(22);
    
    PersonDetails p1 = new PersonDetails();
	 
	p1.setPersonid(103);
    p1.setFirstname("naveen");
    p1.setLastname("mulka");
    p1.setEmail("naveen@gmail.com");
    p1.setAge(24);
    
    List<PersonDetails> persons = List.of(p,p1);
    
    //conversion process
    
   List<Person> listPersons = mapper.modelToEntityListConversion(persons);
     personRepository.saveAll(listPersons);
	
     
     Optional<Person>  per = personRepository.findById(101);
     if(per.isPresent())

     {
    	 System.out.println(per); 
     }
     else
     {
    	 System.out.println("person ie not present");
     }
     
     List<Person> pers = personRepository.findAll();
     System.out.println(pers);
     
     long count=personRepository.count();
     System.out.println(count);
     
     boolean pers1=personRepository.existsById(101);
     System.out.println(pers1);
     
     personRepository.deleteById(102);
     
     personRepository.deleteAll();
     
	}
}

















