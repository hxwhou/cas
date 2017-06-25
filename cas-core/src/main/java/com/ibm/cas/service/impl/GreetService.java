package com.ibm.cas.service.impl;

import org.springframework.boot.logging.LogLevel;
import org.springframework.stereotype.Service;

import com.ibm.cas.exception.CASSystemException;
import com.ibm.cas.log.LoggerContext;

@Service
public class GreetService {
	
	public String sayHello(String name) throws CASSystemException{
		LoggerContext.recordLog("This is sayHello method in cas-core project.", LogLevel.INFO);
		return "Hi, " + name + ". Welcome to my blog.";
	}
}
