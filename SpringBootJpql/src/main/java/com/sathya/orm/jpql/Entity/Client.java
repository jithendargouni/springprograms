package com.sathya.orm.jpql.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sathya.orm.jpql.Repository.BookRepository;

@Component
public class Client implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		List<String> data = bookRepository.getData();
		data.forEach(da->System.out.println(da));
		
		int count = bookRepository.authourCount("jithu");
		System.out.println("no of books"+" ="+count);
		
		List<String> list = bookRepository.authorDistinct();
		System.out.println(list);
		
	}

}
