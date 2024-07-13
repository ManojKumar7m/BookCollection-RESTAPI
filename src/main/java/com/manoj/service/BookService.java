 package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manoj.entity.Book;

@Service
public interface BookService {
	
	public String upsertBook(Book b);
	public List<Book> getBooks();
	public String deleteBook(Integer id);
	
// save() is a upsert method both for insert and update	
//	public String updateBook(Book b);
	
	

}
