package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment {
	public static void main(String args[]) {
		ApplicationContext c1 = new ClassPathXmlApplicationContext("beans.xml");
		AbstractApplicationContext ctx  = new ClassPathXmlApplicationContext("beans.xml");
		Customer e1 = (Customer) c1.getBean("cus1");
		System.out.println(e1.getName() + " " + e1.getId() + " " + e1.getAddress());
		Product p1 = (Product) c1.getBean("pro1");
		System.out.println(p1.getName() + " " + p1.getPrice() + " " + p1.getDescription());
		Customer e2 = (Customer) c1.getBean("cus1");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		Customer c3 = (Customer) ctx.getBean("cus1");
		c3.show();
		ctx.registerShutdownHook();
		ctx.close();
		
		//prototype & singleton
		
	}
}
