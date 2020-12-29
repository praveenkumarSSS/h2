package com.example.BookCRUDExample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookCRUDExample.Service.BookService;
import com.example.BookCRUDExample.entity.BookModel;

@RestController
@RequestMapping("/Book")
public class BookController {
	@Autowired
	BookService service;
@PostMapping("/books")
public BookModel saveData(@RequestBody BookModel book)
{
	return service.save(book);
}

@GetMapping("/books")
public List<BookModel> getAllBooks()
{
	return service.getAll();
	
	}
@GetMapping("/books/{id}")
public BookModel book(@PathVariable int id)
{
	return service.findById(id);
	
}

@PutMapping("/books/{id}")
public BookModel updateBoook(@PathVariable int id, @RequestBody BookModel book)
{
	return service.updateData(id,book);
	
}
@DeleteMapping("/books/{id}")
public BookModel deleteBook(@PathVariable int  id)
{
return service.deleteData(id);	
}
}





