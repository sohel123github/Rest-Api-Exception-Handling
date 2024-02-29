package com.apiexception.exception;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductNotFoundException() {
		super("Product Not Found !");
	}

	public ProductNotFoundException(String msg) {
		super(msg);
	}
}
