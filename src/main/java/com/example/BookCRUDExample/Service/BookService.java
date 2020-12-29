package com.example.BookCRUDExample.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.BookCRUDExample.dao.BookRepository;
import com.example.BookCRUDExample.entity.BookModel;

public class BookService {
	
	@Autowired
	BookRepository repository;

	public BookModel save(BookModel book) {
		
		return repository.save(book);
	}

	public List<BookModel> getAll() {
		return repository.findAll();
	}


	public BookModel updateData(int id, BookModel book) {
		
	BookModel booksModel=repository.findById(id).orElse(null);
	if(booksModel!=null)
	{
		booksModel.setId(booksModel.getId());
		booksModel.setName(book.getName());
		booksModel.setAuthor(book.getAuthor());
	}
	
	return repository.save(booksModel);
		
	}

	public BookModel deleteData(int id) {
		repository.deleteById(id);
		return null;
	}

   public BookModel findById(int id) {
    Optional<BookModel> model=repository.findById(id);
	
	return null;    
	}


}


