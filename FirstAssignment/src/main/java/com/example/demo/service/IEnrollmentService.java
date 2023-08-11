package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Enrollment;

public interface IEnrollmentService {
	public List<Enrollment> getAllEnrollments();
	public Enrollment insertEnrollment(Enrollment e);
}
