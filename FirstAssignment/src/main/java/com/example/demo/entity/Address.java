package com.example.demo.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name="Addresses")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="my_seq")
	@SequenceGenerator(name="my_seq",sequenceName="my_seq",initialValue = 1, allocationSize=1)
	private int id;
	@Column(name="address_line1")
	private String addressLine1;
	@Column(name="address_line2")
	private String addressLine2;
	@Column(name="locality")
	private String locality;
	@Column(name="pincode")
	private int pincode;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="user_id", referencedColumnName="id",nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
	
	
	public Address(int id, String addressLine1, String addressLine2, String locality, int pincode, String city,
			String state, User user) {
		super();
		this.id = id;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.locality = locality;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}