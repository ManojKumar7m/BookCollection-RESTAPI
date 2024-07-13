package com.manoj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manoj.entity.Book;
import com.manoj.repo.BookReposi;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

	private BookReposi bkr;
	 

	
	public String upsertBook(Book b)
	{
		Integer a=b.getBid();
		bkr.save(b);
		if(a==null)
			return " Record Inserted";
		
		return "Record Updated";
	}

	
	public List<Book> getBooks() {
		
		return bkr.findAll();
	}

	
	public String deleteBook(Integer id) {
		
		bkr.deleteById(id);
		return "Book Deleted";
	}

}
