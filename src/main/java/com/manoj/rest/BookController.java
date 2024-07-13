package com.manoj.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.entity.Book;
import com.manoj.service.BookService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BookController {
	
	private BookService bs;
	
	@GetMapping("/")
	public ResponseEntity<String> indxpage()
	{
		return new ResponseEntity<> ("Welcome to Book Controller RestClient 1- Rest Template practice \n Practice using Book Controller RestAPi ",HttpStatus.OK);
	}
	
	
	@PostMapping("/addbook")
	public ResponseEntity<String> addBook(@RequestBody Book b)
	{
		String msg=bs.upsertBook(b);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	
	@PutMapping("/updatebook")
	public ResponseEntity<String> updateBook(@RequestBody Book b)
	{
		String msg=bs.upsertBook(b);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}

	@GetMapping("/getbooks")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		List<Book> l1=bs.getBooks();
		return new ResponseEntity<>(l1,HttpStatus.OK);
	}
	
	@DeleteMapping("/delbook/{bid}")
	public ResponseEntity<String> deleteBook(@PathVariable("bid") Integer id)
	{
		String s1=bs.deleteBook(id);
		return new ResponseEntity<>(s1, HttpStatus.OK);
	}
	
	
}
