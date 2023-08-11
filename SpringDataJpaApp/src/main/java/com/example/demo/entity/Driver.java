package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="DriverDetails")
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="my_seq")
	@SequenceGenerator(name="my_seq",sequenceName="MY_SEQ", initialValue= 10001,allocationSize=1)
	private int driverid;
	@Column(name="dName")
	private String name;
	@Column(name="contactNo")
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
