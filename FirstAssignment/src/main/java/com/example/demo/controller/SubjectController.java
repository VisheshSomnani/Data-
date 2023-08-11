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

import com.example.demo.entity.Subject;
import com.example.demo.entity.Subject;
import com.example.demo.service.ISubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	private ISubjectService service;
	
	@GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Subject>> getAllSubjects(){
		return new ResponseEntity<List<Subject>>(service.getAllSubjects(),HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Subject> addSubject(@RequestBody Subject b1)
	{
		Subject vc = service.insertSubject(b1);
		return new ResponseEntity<Subject>(vc,HttpStatus.CREATED);
	}
}
