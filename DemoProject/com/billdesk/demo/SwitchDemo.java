package com.billdesk.demo;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(i == 1) {
			System.out.println("Enter Day/Number");
			String str = sc.next();
			switch(str){
				case "Monday":
				case "Mon":
				case "1":
					System.out.println("Ufff!What a Busy Day");
					break;
				case "Tuesday":
				case "Tue":
				case "2":
					System.out.println("Blending Innn");
					break;
				case "Wednesday":
				case "Wed":
				case "3":
					System.out.println("Day Of Hope");
					break;
				case "Thursday":
				case "Thu":
				case "4":
					System.out.println("Closer To Weekend");
					break;
				case "Friday":
				case "Fri":
				case "5":
					System.out.println("Woah Finally Its here");
					break;
				case "Saturday":
				case "Sat":
				case "6":
					System.out.println("Its D DAY YES YES YES");
					break;
				case "Sunday":
				case "Sun":
				case "7":
					System.out.println("Its Ended Before it started!!!");
					break;
				default:
					System.out.println("Pls Enter The Correct Input");
			}
			System.out.println("Do You Want To Continue\n Enter 1 if you want to continue\n Press 0 for Exit");
			i = sc.nextInt();
		}
	}
}
