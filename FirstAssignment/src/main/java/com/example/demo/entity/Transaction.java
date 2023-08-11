package com.example.demo.entity;

import java.util.HashSet;
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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Transactions")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="my_seq")
	@SequenceGenerator(name="my_seq",sequenceName="my_seq",initialValue = 1, allocationSize=1)
	private int id;
	private float total;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="user_id", referencedColumnName="id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
	@OneToMany(mappedBy = "transaction")
	Set<Enrollment> enrollments;
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "transaction_books",
        joinColumns = @JoinColumn(name = "transaction_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
	private Set<Book> books = new HashSet<>();
	public Transaction(int id, float total, User user, Set<Enrollment> enrollments, Set<Book> books) {
		super();
		this.id = id;
		this.total = total;
		this.user = user;
		this.enrollments = enrollments;
		this.books = books;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Enrollment> getEnrollment() {
		return enrollments;
	}
	public void setEnrollment(Set<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", total=" + total + ", user=" + user + ", enrollments=" + enrollments
				+ ", books=" + books + "]";
	}
	
}
