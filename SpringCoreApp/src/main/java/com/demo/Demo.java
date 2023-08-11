package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String args[]) {
		ApplicationContext c1 = new ClassPathXmlApplicationContext("beans.xml");
		Employee e1 = (Employee) c1.getBean("emp1");
//		Employee e1 = c1.getBean(Employee.class);
		System.out.println(e1.getEmpid() + " " + e1.getEname() + " " + e1.getSalary());
		Employee e2 = (Employee) c1.getBean("emp2");
		System.out.println(e2.getEmpid() + " " + e2.getEname() + " " + e2.getSalary());
		e1 = (Employee) c1.getBean("emp4");
		System.out.println(e1.getEmpid() + " " + e1.getEname() + " " + e1.getSalary());
		
		
	}
}
