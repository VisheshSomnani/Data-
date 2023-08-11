package com.example.demo.entity;

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
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Enrollments")
public class Enrollment {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="my_seq")
	@SequenceGenerator(name="my_seq",sequenceName="my_seq",initialValue = 1, allocationSize=1)
	private int id;
	private String schoolCode;
	private String schoolName;
	private String studentName;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="user_id", referencedColumnName="id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="subect_id", referencedColumnName="id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Subject subject;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="class_id", referencedColumnName="id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Class class1;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="exam_id", referencedColumnName="id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Exam exam;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="transaction_id", referencedColumnName="id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Transaction transaction;

	public Enrollment(int id, String schoolCode, String schoolName, String studentName, User user, Subject subject,
			Class class1, Exam exam, Transaction transaction) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.schoolName = schoolName;
		this.studentName = studentName;
		this.user = user;
		this.subject = subject;
		this.class1 = class1;
		this.exam = exam;
		this.transaction = transaction;
	}

	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Enrollment [id=" + id + ", schoolCode=" + schoolCode + ", schoolName=" + schoolName + ", studentName="
				+ studentName + ", user=" + user + ", subject=" + subject + ", class1=" + class1 + ", exam=" + exam
				+ ", transaction=" + transaction + "]";
	}
	
}
