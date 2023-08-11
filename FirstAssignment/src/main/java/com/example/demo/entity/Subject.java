package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Subjects")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="my_seq")
	@SequenceGenerator(name="my_seq",sequenceName="my_seq",initialValue = 1, allocationSize=1)
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "subject")
    Set<Book> books;
	public Subject(int id, String name, Set<Book> books, Set<Exam> exams, Set<Enrollment> enrollments,
			Set<Class> classes) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
		this.exams = exams;
		this.enrollments = enrollments;
		this.classes = classes;
	}
	@OneToMany(mappedBy = "subject")
	Set<Exam> exams;
	@OneToMany(mappedBy = "subject")
	Set<Enrollment> enrollments;
	@ManyToMany(mappedBy = "subjects", fetch = FetchType.LAZY)
    private Set<Class> classes = new HashSet<>();
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
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
	

	public Set<Class> getClasses() {
		return classes;
	}
	public void setClasses(Set<Class> classes) {
		this.classes = classes;
	}
	
}
