package com.sathya.orm.jpql.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sathya.orm.jpql.Entity.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book, Integer>
{
	@Query("select b.isbn,b.author from Book b")
	public List<String> getData();
	
	@Query("select count(b) from Book b where b.author=:author")
	public int authourCount(String author);
	
	@Query("select distinct b.author from Book b")
	public List<String> authorDistinct();
	
	
}