package com.IFind.exception;

public class NoEntityException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub

		return "NoEntity Found";
	}

}
