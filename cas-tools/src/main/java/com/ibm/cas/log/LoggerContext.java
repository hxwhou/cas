package com.ibm.cas.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.LogLevel;

import com.ibm.cas.enums.ErrorCode;


public class LoggerContext{
	private static final Logger logger = LoggerFactory.getLogger(LoggerContext.class);

	public static void recordLog(ErrorCode errorCode, String message, LogLevel level){
		if( LogLevel.DEBUG == level){
			logger.debug(message.concat(errorCode.toString()));	
		} else if( LogLevel.INFO == level){
			logger.info(message.concat(errorCode.toString()));	
		} else if( LogLevel.WARN == level){
			logger.warn(message.concat(errorCode.toString()));	
		} else if( LogLevel.ERROR == level){
			logger.error(message.concat(errorCode.toString()));	
		} 
	}
	
	public static void recordLog(ErrorCode errorCode, String message, Throwable cause, LogLevel level){
		if( message == null ){
			message = "";
		}
		if( LogLevel.DEBUG == level){
			logger.debug(message.concat(errorCode.toString()), cause);
		} else if( LogLevel.INFO == level){
			logger.info(message.concat(errorCode.toString()), cause);	
		} else if( LogLevel.WARN == level){
			logger.warn(message.concat(errorCode.toString()), cause);
		} else if( LogLevel.ERROR == level){
			logger.error(message.concat(errorCode.toString()), cause);
		}
	}

	public static void recordLog(String message, LogLevel level) {
		if( LogLevel.DEBUG == level){
			logger.debug(message);	
		} else if( LogLevel.INFO == level){
			logger.info(message);	
		} else if( LogLevel.WARN == level){
			logger.warn(message);	
		} else if( LogLevel.ERROR == level){
			logger.error(message);	
		} 
	}
}
