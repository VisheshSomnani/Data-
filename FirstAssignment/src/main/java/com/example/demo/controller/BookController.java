package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.entity.User;
import com.example.demo.service.IBookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private IBookService service;
	@PostMapping("/add")
	public ResponseEntity<Book> addBook(@RequestBody Book b1)
	{
		Book vc = service.insertBook(b1);
		return new ResponseEntity<Book>(vc,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>> getAllBooks(){
		return new ResponseEntity<List<Book>>(service.getAllBooks(),HttpStatus.OK);
	}
}
