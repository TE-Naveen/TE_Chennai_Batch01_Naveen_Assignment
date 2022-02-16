package com.te.tracking.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.tracking.exception.UserException;

@ControllerAdvice
public class UserControllerAdvice {
	@ExceptionHandler(UserException.class)
	public String handleEE(UserException exp,HttpServletRequest req) {
		req.setAttribute("err",exp.getMessage());
		return "loginform";
	}


}
