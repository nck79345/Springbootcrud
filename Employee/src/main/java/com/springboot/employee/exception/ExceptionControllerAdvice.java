package com.springboot.employee.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	@ExceptionHandler(Exception.class)
 public String exceptionhandler(Exception e) {
	 return e.getMessage();
 }
}
