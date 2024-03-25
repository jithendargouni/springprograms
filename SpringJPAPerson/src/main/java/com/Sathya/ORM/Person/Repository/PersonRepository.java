package com.Sathya.ORM.Person.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sathya.ORM.Person.Entity.Person;

@Repository
public interface PersonRepository  extends JpaRepository<Person, Integer> {

}
