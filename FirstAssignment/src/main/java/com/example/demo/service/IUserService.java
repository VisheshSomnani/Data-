package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;
import com.example.demo.entity.Enrollment;
import com.example.demo.entity.User;

public interface IUserService {

	List<User> getAllUsers();
	User insertUser(User u1);
	List<Enrollment> getAllEnrollmentsOfUser(int userId);
	List<Book> getAllBooksOfUser(int userId);
}
