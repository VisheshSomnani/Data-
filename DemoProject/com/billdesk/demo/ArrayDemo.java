package com.billdesk.demo;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String args[]) {
		String names[] = new String[10];
		Scanner sc = new Scanner(System.in);
		int i =0;
		for(i = 0;i < 10;i++) {
			names[i] = sc.next();
		}
		//Sorting Logic
		for(i = 0;i < 10;i++) {
			for(int j = i+1;j < 10;j++) {
				if(names[i].toLowerCase().charAt(0) > names[j].toLowerCase().charAt(0)) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		display(names);
		
	}
	public static void display(String names[]) {
		for(int i = 0;i<10;i++) {
			System.out.print(names[i] + " ");
		}
	}
	
}
