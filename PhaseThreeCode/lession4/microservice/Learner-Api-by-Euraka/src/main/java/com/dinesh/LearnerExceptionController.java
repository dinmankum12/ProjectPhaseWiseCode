package com.dinesh;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LearnerExceptionController {

	@ExceptionHandler(value = LearnerNotFoundException.class)
	public ResponseEntity<Object> exception(LearnerNotFoundException exception){
		return new ResponseEntity<>("Learner not found", HttpStatus.NOT_FOUND);
	}
	
}
