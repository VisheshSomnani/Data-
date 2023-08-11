package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface IBookService {
	List<Book> getAllBooks();
	Book insertBook(Book b1);
}
