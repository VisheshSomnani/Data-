package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IBookDao;
import com.example.demo.entity.Book;
@Service
public class BookServiceImpl implements IBookService{
	
	@Autowired
	private IBookDao dao;
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Book insertBook(Book b1) {
		// TODO Auto-generated method stub
		return dao.save(b1);
	}

}
