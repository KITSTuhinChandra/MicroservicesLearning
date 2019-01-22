package com.example.demo.handler;

import java.util.Date;

import org.everit.json.schema.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.constant.LoggerConstants;
import com.example.demo.exception.ExceptionResponse;

/**
 * This class acts as custom exception handler to handle the below scenarios.
 * 1) API unavailable exception (Service is not responding/unavailable)
 * 2) Data formats (In request unable to locate or find the required elements or missing the required types)
 * 3) Process related exceptions (Transformations, business logic)
 * @author kits
 *
 */
@Component
@ControllerAdvice
public class CustomExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);

	/**
	 * It will handle ValidationException defined in exception package
	 * * ApiError is used to show the exception as output in case of APIUnavailableException generated
	 * @param validationEx
	 * @param request
	 * @return ResponseEntity
	 */
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<ExceptionResponse> validationException(final ValidationException validationEx) {
		logger.debug(LoggerConstants.DEBUG_LOG_ENTERED,"validationException()");
		logger.error(LoggerConstants.ERROR_LOG_MSG , validationEx.getMessage());
		ExceptionResponse errResponse = new ExceptionResponse("500",validationEx.getMessage(),validationEx.getMessage(),new Date());//need to change hard coded 500 and date as null
		logger.error(LoggerConstants.ERROR_LOG_MSG_STACK_TRACE, validationEx.getMessage());
		logger.debug(LoggerConstants.DEBUG_LOG_LEAVING,"validationException()");
		return new ResponseEntity<>(errResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	



}
