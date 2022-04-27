package com.hans.toyprojectback.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
* @packageName : com.hans.toyprojectback.exception 
* @fileName : ExceptionAdvisor.java 
* @author : LEE HAN 
* @date : 2022.04.24 
* @description : Exception 전역 처리
* =========================================================== 
* DATE AUTHOR NOTE 
* ----------------------------------------------------------- 
* 2022.04.24 LEE HAN 최초 생성 
*/
@RestControllerAdvice
public class ExceptionAdvisor {
	
	/** 
	* @methodName : processValidationError 
	* @author : LEE HAN 
	* @date : 2022.04.24 
	* @param exception
	* @return 
	*/
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> processValidationError(MethodArgumentNotValidException exception) {
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		
		ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),
				fieldErrors.get(0).getField(),
				fieldErrors.get(0).getDefaultMessage(),
				fieldErrors.get(0).getRejectedValue());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	}
	
	
	/** 
	* @methodName : dataIntegrityViolationException 
	* @author : LEE HAN 
	* @date : 2022.04.24 
	* @param exception
	* @return 
	*/
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<ErrorResponse> dataIntegrityViolationException(DataIntegrityViolationException exception) {
		ConstraintViolationException cause = (ConstraintViolationException) exception.getCause();
		
		ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(),
				cause.getConstraintName(),
				exception.getMostSpecificCause().getMessage(),
				null);
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
	}
	
	/** 
	* @methodName : illegalArgumentException 
	* @author : LEE HAN 
	* @date : 2022.04.27 
	* @param exception
	* @return 
	*/
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ErrorResponse> illegalArgumentException(IllegalArgumentException exception) {
		ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), "", "부적합한 인수 전달", null);
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
	}
	
}
