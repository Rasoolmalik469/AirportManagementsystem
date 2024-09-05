package com.hcl.airport.AirportHangarService.appexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
/** Rasool Malik Vempalli **/
@ControllerAdvice
public class ExceptionController {

	 @ExceptionHandler(value = ListEmptyException.class)
	public ResponseEntity<Object> exceptionOne(ListEmptyException exception) 
	{
		 return new ResponseEntity<>("No Hangars to show", HttpStatus.NOT_FOUND);
	}
	
}
