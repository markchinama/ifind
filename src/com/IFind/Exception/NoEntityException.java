package com.IFind.exception;

public class NoEntityException extends RuntimeException {

	public NoEntityException(String message) {
		super(message);
	}
	
	public NoEntityException(String message, Throwable t) {
		super(message, t);
		this.setStackTrace(t.getStackTrace());
	}
	
	public NoEntityException(Throwable t) {
		super(t);
		this.setStackTrace(t.getStackTrace());
	}
	

}
