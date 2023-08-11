package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IExamDao;
import com.example.demo.entity.Exam;
@Service
public class ExamServiceImpl implements IExamService{
	@Autowired
	private IExamDao dao;
	@Override
	public List<Exam> getAllExams() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Exam insertExam(Exam e) {
		// TODO Auto-generated method stub
		return dao.save(e);
	}

	@Override
	public Exam getExamById(int examId) {
		// TODO Auto-generated method stub
		return dao.findById(examId).get();
	}
}
