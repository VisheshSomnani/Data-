package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.Customer;
import com.demo.beans.Product;
import com.demo.config.MyConfig;

public class App {
	public static void main(String args[]) {
		ApplicationContext c1 = new AnnotationConfigApplicationContext(MyConfig.class);
		Customer e1 = (Customer) c1.getBean("c2");
		System.out.println(e1.show());
	}
	
}
