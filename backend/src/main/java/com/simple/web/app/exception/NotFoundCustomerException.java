package com.simple.web.app.exception;

public class NotFoundCustomerException extends RuntimeException {

	private static final long serialVersionUID = -6154555326990836178L;

	public NotFoundCustomerException(String message) {
		super(message);
	}

}
