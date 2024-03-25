package com.Sathya.ORM.Person.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDetails {
	 

	private int personid;
	private String firstname;
	private String lastname;
	private String email;
	private int age;
	
	
}
