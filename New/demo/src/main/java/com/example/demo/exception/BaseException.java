package com.example.demo.exception;

public class BaseException extends Exception {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -132421862952456452L;
	/**
	 * Describied proper message
	 */
	private String errorMessage;
	/**
	 * Type of message like BAD REQUEST, ACCESS DENITED ...
	 */
	private String type;
	/**
	 * Code from differnt API or system or from the process to distingwish Like 201, 200,400 ...
	 */
	private Integer code;
	/**
	 * Reference message or resource like stating the problem context or message typr from particualr API or system
	 */
	private String reference;
	
	/**
	 * Default Constructor
	 */
	public BaseException() {
		
	}
	/**
	 * @param message String
	 * @param type String
	 * @param code Integer
	 * @param reference String
	 */
	public BaseException(String message, String type, Integer code, String reference) {
		super();
		this.errorMessage = message;
		this.type = type;
		this.code = code;
		this.reference = reference;
	}
	
	/**
	 * @param message String
	 * @param code Integer
	 */
	public BaseException(String message, Integer code) {
		super();
		this.errorMessage = message;
		this.code = code;
	}
	
	/**
	 * @param message String
	 * @param cause Throwable
	 */
	public BaseException(String message, Throwable cause) {
		super(message,cause);
		
	}
	/**
	 * Constructor with Throwable cause.
	 * @param message String
	 * @param type String
	 * @param code Integer
	 * @param reference String
	 * @param cause Throwable
	 */
	 public BaseException(String message, String type, Integer code, String reference, Throwable cause) {
        super(message,cause);
        this.type = type;
		this.code = code;
		this.reference = reference;
	 }

	/**
	 * @return the message
	 */
	public String geterrorMessage() {
		return errorMessage;
	}

	/**
	 * @param message the message to set
	 */
	public void seterrorMessage(String message) {
		this.errorMessage = message;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

}
