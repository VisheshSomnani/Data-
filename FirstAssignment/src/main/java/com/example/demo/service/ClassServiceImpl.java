package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IClassDao;
import com.example.demo.entity.Class;
import com.example.demo.entity.Subject;
import com.example.demo.entity.User;

import jakarta.persistence.EntityNotFoundException;
@Service
public class ClassServiceImpl implements IClassService{
	
	@Autowired
	IClassDao dao;
	@Override
	public List<Class> getAllClasses(){
		return dao.findAll();
	}
	public Set<Subject> getSubjectsByClassId(int classId){
		System.out.println("Test1 Inside CSI");
		Class class1 = dao.findById(classId)
                .orElseThrow(() -> new EntityNotFoundException("Class not found with ID: " + classId));

        return class1.getSubjects();
	}
	@Override
	public Class insertClass(Class b1) {
		// TODO Auto-generated method stub
		return dao.save(b1);
	}
	@Override
	public List<Subject> getAllSubjectsOfClass(int classId) {
		// TODO Auto-generated method stub
		Class c = dao.getById(classId);
		return new ArrayList<>(c.getSubjects());
	}
	
}
