package com.example.demo.exception;

public class VehicleAlreadyExistsException extends RuntimeException{
	private String msg;

	public VehicleAlreadyExistsException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public VehicleAlreadyExistsException() {
		super();
	}
	
}
