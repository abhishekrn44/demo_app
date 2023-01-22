package io.abhishek.demo;

import org.springframework.http.HttpStatus;

public class Result {

	private String message;
	private HttpStatus status;
	private String exception;

	public Result(String message, HttpStatus status, String exception) {
		super();
		this.message = message;
		this.status = status;
		this.exception = exception;
	}

	public Result() {

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

}
