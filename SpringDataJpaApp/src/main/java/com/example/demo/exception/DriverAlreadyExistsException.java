package com.example.demo.exception;

public class DriverAlreadyExistsException extends RuntimeException{

	private String msg;

	public DriverAlreadyExistsException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public DriverAlreadyExistsException() {
		super();
	}
	
}
