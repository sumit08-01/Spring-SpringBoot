package com.spring.mvc.controller;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public * com.spring.mvc.controller.EmployeeController.getAllEmployee())")
	public void logBefore() {
		LOGGER.info("getAllEmployee Method calling Started"); //
	}
	
//	@After("execution(public * com.spring.mvc.controller.EmployeeController.getAllEmployee())") 
//	// ByDefault @After annotaton is the finally by default, If exception occur the method is executed 
//	public void logAfter() {
//		LOGGER.info("getAllEmployee Method called Ended"); //
//	}
	
	@AfterReturning("execution(public * com.spring.mvc.controller.EmployeeController.getAllEmployee())") 
	public void logAfterException() { // this method is not executed when any exception is occurred in the class
		LOGGER.info("getAllEmployee Method called Ended"); //
	}
	
	@AfterThrowing("execution(public * com.spring.mvc.controller.EmployeeController.getAllEmployee())") 
	// ByDefault @After annotaton is the finally by default, If exception occur the method is executed 
	public void logAfterThrowing() { // this method is executed when any exception is occurred in the class
		LOGGER.info("getAllEmployee Method got Exception"); //
	}
		
}
