package com.example.demo.entity;

import java.util.Set;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Exams")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="my_seq")
	@SequenceGenerator(name="my_seq",sequenceName="my_seq",initialValue = 1, allocationSize=1)
	private int id;
	private String name;
	private float fees;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="subject_id", referencedColumnName="id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Subject subject;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="class_id", referencedColumnName="id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Class class1;

	@OneToMany(mappedBy = "exam")
	Set<Enrollment> enrollments;
	
	public Set<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(Set<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	public Exam(int id, String name, float fees, Subject subject, Class class1, Set<Enrollment> enrollments) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.subject = subject;
		this.class1 = class1;
		this.enrollments = enrollments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Class getClass1() {
		return class1;
	}

	public void setClass1(Class class1) {
		this.class1 = class1;
	}

	public Exam(int id, String name, float fees, Subject subject, Class class1) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.subject = subject;
		this.class1 = class1;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
