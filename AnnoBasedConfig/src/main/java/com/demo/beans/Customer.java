package com.demo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value = "cust1")
public class Customer implements InitializingBean, DisposableBean{
	@Value(value = "KASHT")
	private String name;
	public Customer() {
		super();
	}
	@Value(value = "67")
	private int id;
	@Value(value = "Khatra Mahel")
	private String address;
	@Autowired
	private Product product;
	public void initABC() {
		System.out.println("Bean is going through init");
	}
	public void destroyABC() {
		System.out.println("Bean will destroy you");
	}
	public Customer(String name, int id, String address , Product product) {
		super();
		System.out.println("inside con");
		this.name = name;
		this.id = id;
		this.address = address;
		this.product = product;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", address=" + address + ", product=" + product + "]";
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
	public String show() {
		return toString();
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
	public Product getProduct() {
		return product;
	}
	@Autowired
	public void setProduct(Product product) {
		System.out.println("In set");
		this.product = product;
	}
	public void start() {
		System.out.println("start called");
	}
	public void stop() {
		System.out.println("stop called");
	}
}
