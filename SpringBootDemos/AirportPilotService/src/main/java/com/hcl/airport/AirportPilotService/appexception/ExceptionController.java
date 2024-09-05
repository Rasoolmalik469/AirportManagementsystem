package com.hcl.airport.AirportPilotService.appexception;
/** Rasool Malik Vempalli **/
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	 @ExceptionHandler(value = ListEmptyException.class)
	public ResponseEntity<Object> exceptionOne(ListEmptyException exception) 
	{
		 return new ResponseEntity<>("No Pilots to show", HttpStatus.NOT_FOUND);
	}
	
}