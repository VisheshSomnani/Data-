package com.example.demo.service;

import java.util.List;
import java.util.Set;

import com.example.demo.entity.Book;
import com.example.demo.entity.Class;
import com.example.demo.entity.Enrollment;
import com.example.demo.entity.Subject;
public interface IClassService {
	public List<Class> getAllClasses();
	public Set<Subject> getSubjectsByClassId(int classId);
	public Class insertClass(Class c1);
	List<Subject> getAllSubjectsOfClass(int classid);
}
