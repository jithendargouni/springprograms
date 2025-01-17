package com.Sathya.ORM.Person.Entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Person {
	@Id
	private int personid;
	private String firstname;
	private String lastname;
	private String email;
	private int age;
	
	@CreatedDate
	private LocalDateTime createAt;
	
	@CreatedBy
	private String createBy;
	
	
	
}
