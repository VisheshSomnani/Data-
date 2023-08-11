package com.example.demo.controller;

import java.util.List;
import java.util.Set;

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
import com.example.demo.entity.Class;
import com.example.demo.entity.Enrollment;
import com.example.demo.entity.Subject;
import com.example.demo.service.IClassService;
@RestController
@RequestMapping("/class")
public class ClassController {
	@Autowired
	private IClassService service;
	
	@GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Class>> getClassList(){
		return new ResponseEntity<List<Class>>(service.getAllClasses(),HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Class> addClass(@RequestBody Class c1)
	{
		Class vc = service.insertClass(c1);
		return new ResponseEntity<Class>(vc,HttpStatus.CREATED);
	}
	@GetMapping(value = "/{classId}/subjects",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Subject>> getAllEnrollmentsOfUser(@PathVariable("classId")int classId){
		return new ResponseEntity<List<Subject>>(service.getAllSubjectsOfClass(classId),HttpStatus.OK);
	}
//	@GetMapping(value = "/subject/{classId}",produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Set<Subject>> getSubjectsByClassId(@PathVariable("classId")int classId){
//		System.out.println("Test1 Inside CSI2");
//		return new ResponseEntity<Set<Subject>>((Set<Subject>) service.getSubjectsByClassId(classId),HttpStatus.OK);
//	}
}
