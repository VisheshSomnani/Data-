package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Exam;
@Repository
public interface IExamDao extends JpaRepository<Exam,Integer>{

}
