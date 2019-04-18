package com.capgemini.salesmanagement.exception;

public class SalesException extends Exception { // user defined exception class
	
	private String msg;

	public SalesException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage()
	{
		return msg;
	}

}
