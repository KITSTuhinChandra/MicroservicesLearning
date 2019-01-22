package com.example.demo.exception;

public class InvalidEANException extends Exception {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4916109466858179316L;

	/**
	 * default constructor
	 */
	public InvalidEANException() {
		super();
	}

	/**
	 * 
	 * @param message
	 *            String
	 */
	public InvalidEANException(String message) {
		super(message);
	}

	/**
	 * 
	 * @param message
	 *            String
	 * @param throwable
	 *            Throwable
	 */
	public InvalidEANException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
