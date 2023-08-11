package com.example.demo.exception;

public class VehicleNotFoundException extends RuntimeException {
	private String msg;

	public VehicleNotFoundException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public VehicleNotFoundException() {
		super();
	}
	
}
