package com.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean, DisposableBean{
	private String name;
	private int id;
	private String address;
	public void initABC() {
		System.out.println("Bean is going through init");
	}
	public void destroyABC() {
		System.out.println("Bean will destroy you");
	}
	public Customer(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void show() {
		System.out.println("Show Method Called");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Teardown activities");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Setup activities");
	}
	public Customer() {
		super();
	}
	
	
}
