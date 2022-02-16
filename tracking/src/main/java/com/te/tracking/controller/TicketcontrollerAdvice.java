package com.te.tracking.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.tracking.exception.BookingException;

@ControllerAdvice
public class TicketcontrollerAdvice {
	
	@ExceptionHandler(BookingException.class)
	public String handleEE(BookingException exp,HttpServletRequest req) {
		req.setAttribute("err",exp.getMessage());
		return "welcome";

}
}