package com.example.demo.exception;

import java.util.List;

public class ExceptionResponseJsonObj {
	
	/**
	 * @return the errors
	 */
	public List<ExceptionResponse> getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<ExceptionResponse> errors) {
		this.errors = errors;
	}

	private List<ExceptionResponse> errors;
}
