package com.example.demo.exception;

import java.util.Date;

public class ExceptionResponse {
	
	private String errorCode;
	private String message;
	private String reason;
	private Date timestamp;
	
	/**
	 * Auto-generated constructor
	 */
	public ExceptionResponse() {
		super();
	}
	/**
	 * @param errorCode int
	 * @param message String
	 * @param reason String 
	 * @param timestamp Date
	 */
	public ExceptionResponse(String errorCode, String message, String reason, Date timestamp) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.reason = reason;
		this.timestamp = timestamp;
	}

	/**
	 * overriden toString() method.
	 */
	@Override
	public String toString() {
		return "ExceptionResponse [errorCode==" + errorCode + ", message==" + message + ", reason==" + reason
				+ ", timestamp==" + timestamp + "]";
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}