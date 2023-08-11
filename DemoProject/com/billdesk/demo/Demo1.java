package com.billdesk.demo;

public class Demo1 {
	public static void main(String args[]) {
		for(int i = 0;i < args.length ;++i) {
			System.out.println(args[i]);
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1+num2);
		Calculator cal = new Calculator();
		System.out.println(cal.add(1, 68));
		for(int i =1;i<51;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num);i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
