package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.demo.beans.Customer;
import com.demo.beans.Product;
@Configuration
public class MyConfig {
	@Bean(name="c2",initMethod = "start",destroyMethod="stop")
	@Scope("singleton")
	public Customer getCust2() {
		Customer c = new Customer();
		c.setName("Vishesh");
		c.setId(111);
		c.setAddress("Khatra mahel");
		c.setProduct(getProd2());
		return c;
	}
	@Bean(name= "c1")
	@Scope("singleton")
	public Customer getCust1() {
		Customer c = new Customer();
		c.setName("Keyul");
		c.setId(112);
		c.setAddress("Khatra Khatra");
		c.setProduct(getProd1());
		return c;
	}
	@Bean(name= "p2")
	public Product getProd2() {
		return new Product("Fan","Helicopter Helicopter",690);
	}
	@Bean(name= "p1")
	public Product getProd1() {
		return new Product("Pankha","Fan but in Hindi",960);
	}
}
