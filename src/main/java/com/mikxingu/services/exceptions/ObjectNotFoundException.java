package com.mikxingu.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String errorCause) {
		super(errorCause);
	}

	public ObjectNotFoundException(String errorCause, Throwable cause) {
		super(errorCause, cause);
	}
	

}
