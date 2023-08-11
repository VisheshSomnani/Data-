package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Subject;

public interface ISubjectService {
	public List<Subject> getAllSubjectsByClass(String class1);
	public List<Subject> getAllSubjects();
	public Subject insertSubject(Subject s);
}
