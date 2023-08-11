package com.billdesk.demo;

public class WrapperDemo {
	public static void main(String args[]) {
		Long l1 = 10l;
		Integer i1 = 10; //AUTOBOXING
		int k = i1; //UNBOXING
		k = new Integer(i1); //AUTOUNBOXING
		long l2 = 10;
		float f1 = i1; //widening
		i1 = (int) f1; //type casting
		
	}
}
