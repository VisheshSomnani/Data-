package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISubjectDao;
import com.example.demo.entity.Subject;

@Service
public class SubjectServiceImpl implements ISubjectService{
	@Autowired
	ISubjectDao dao;
	@Override
	public List<Subject> getAllSubjectsByClass(String class1){
		return null;
	}
	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public Subject insertSubject(Subject s) {
		// TODO Auto-generated method stub
		return dao.save(s);
	}
	
}
