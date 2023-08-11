package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Subject;
@Repository
public interface ISubjectDao extends JpaRepository<Subject,Integer>{
	@Query("Select s From Subject s")
	public List<Subject> getAllSubjectsByClass(String class1);
}
