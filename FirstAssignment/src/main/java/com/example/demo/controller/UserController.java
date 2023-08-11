package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.entity.Enrollment;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService service;
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User v1)
	{
		User vc = service.insertUser(v1);
		return new ResponseEntity<User>(vc,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<List<User>>(service.getAllUsers(),HttpStatus.OK);
	}
	@GetMapping(value = "/{userId}/enrollments",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Enrollment>> getAllEnrollmentsOfUser(@PathVariable("userId")int userId){
		return new ResponseEntity<List<Enrollment>>(service.getAllEnrollmentsOfUser(userId),HttpStatus.OK);
	}
	@GetMapping(value = "/{userId}/books",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>> getAllBooksOfUser(@PathVariable("userId")int userId){
		return new ResponseEntity<List<Book>>(service.getAllBooksOfUser(userId),HttpStatus.OK);
	}
}
