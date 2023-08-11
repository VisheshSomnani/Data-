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

import com.example.demo.entity.Exam;
import com.example.demo.service.IExamService;
@RestController
@RequestMapping("/exam")
public class ExamController {
	@Autowired
	private IExamService service;
	@PostMapping("/add")
	public ResponseEntity<Exam> addExam(@RequestBody Exam b1)
	{
		Exam vc = service.insertExam(b1);
		return new ResponseEntity<Exam>(vc,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Exam>> getAllExams(){
		return new ResponseEntity<List<Exam>>(service.getAllExams(),HttpStatus.OK);
	}
	@GetMapping(value = "/{examId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Exam> getExamById(@PathVariable("examId")int examId){
		return new ResponseEntity<Exam>(service.getExamById(examId),HttpStatus.OK);
	}
}
