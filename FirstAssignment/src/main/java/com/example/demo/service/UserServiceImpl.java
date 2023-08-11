package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUserDao;
import com.example.demo.entity.Book;
import com.example.demo.entity.Enrollment;
import com.example.demo.entity.User;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	IUserDao dao;
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public User insertUser(User u1) {
		// TODO Auto-generated method stub
		return dao.save(u1);
	}
	@Override
	public List<Enrollment> getAllEnrollmentsOfUser(int userId) {
		// TODO Auto-generated method stub
		User u = dao.getById(userId);
		return new ArrayList<>(u.getEnrollments());
	}
	@Override
	public List<Book> getAllBooksOfUser(int userId) {
		// TODO Auto-generated method stub
		User u = dao.findById(userId).get();
		return new ArrayList<>(u.getBooks());
	}
}
