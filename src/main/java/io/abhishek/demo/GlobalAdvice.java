package io.abhishek.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalAdvice {
	
	@ExceptionHandler (HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<Result> handle(HttpRequestMethodNotSupportedException ex) {
		Result res = new Result();
		res.setException(ex.getMessage());
		res.setStatus(HttpStatus.METHOD_NOT_ALLOWED);
		res.setMessage("Wrong HTTP Method");
		return new ResponseEntity<Result>(res, HttpStatus.METHOD_NOT_ALLOWED);
	}
}
