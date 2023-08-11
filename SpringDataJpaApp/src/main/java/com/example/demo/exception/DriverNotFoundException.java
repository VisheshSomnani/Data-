package com.example.demo.exception;

public class DriverNotFoundException extends RuntimeException{
	private String msg;

	public DriverNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public DriverNotFoundException() {
		super();
	}
	
}
