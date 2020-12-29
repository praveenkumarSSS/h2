package com.example.BookCRUDExample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookCRUDExample.entity.BookModel;

public interface BookRepository extends JpaRepository<BookModel,Integer>{

}
