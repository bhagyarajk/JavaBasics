package com.keepitsimple.exceptionhandling;

public class InsufficientBalenceAmout extends RuntimeException {

	private String message;

	public InsufficientBalenceAmout(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;

	}
}
