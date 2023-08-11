package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DriverDetails")
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int driverid;
	@Column(name="dName")
	private String name;
	@Column(name="contact")
	private long contactno;
	
	
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(int driverid, String name, long contactno) {
		super();
		this.driverid = driverid;
		this.name = name;
		this.contactno = contactno;
	}
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Driver [driverid=" + driverid + ", name=" + name + ", contactno=" + contactno + "]";
	}
	
	
}
