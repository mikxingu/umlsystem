package com.mikxingu.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer errorStatus;
	private String errorMessage;
	private Long timeStamp;
	
	public StandardError(Integer errorStatus, String errorMessage, Long timeStamp) {
		super();
		this.errorStatus = errorStatus;
		this.errorMessage = errorMessage;
		this.timeStamp = timeStamp;
	}
	public Integer getErrorStatus() {
		return errorStatus;
	}
	public void setErrorStatus(Integer errorStatus) {
		this.errorStatus = errorStatus;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	
}
