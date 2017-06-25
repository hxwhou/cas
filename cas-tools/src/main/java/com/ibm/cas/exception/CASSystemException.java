package com.ibm.cas.exception;

import org.springframework.boot.logging.LogLevel;

import com.ibm.cas.enums.ErrorCode;
import com.ibm.cas.log.LoggerContext;


/**
 * <p>This exception hierarchy aims to let user code find and handle the
 * kind of error encountered without knowing the details of the particular
 * service API in use.
 *
 * <p>As this class is a runtime exception, there is no need for user code
 * to catch it or subclasses if any error is to be considered fatal
 * (the usual case).
 * 
 * @author cruise
 * 
 */
@SuppressWarnings("serial")
public class CASSystemException extends RuntimeException {

	private ErrorCode errorCode;

	/**
	 * Constructor for ISGSystemException.
	 * @param errorCode the service error code(which is saved for later retrieval
     *         by the {@link #getErrorCode()} method).
	 * @param message the detail message(which is saved for later retrieval
     *         by the {@link #getMessage()} method).
	 */
	public CASSystemException(ErrorCode errorCode, LogLevel level, String message) {
		super(message);
		if( message == null ) {
			message = "";
		}	
		this.errorCode = errorCode;
		LoggerContext.recordLog(errorCode, message, level);
		
	}

	/**
	 * Constructor for ISGSystemException.
	 * @param errorCode the service error code(which is saved for later retrieval
     *         by the {@link #getErrorCode()} method).
	 * @param message the detail message(which is saved for later retrieval
     *         by the {@link #getMessage()} method).
	 * @param cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).
	 */
	public CASSystemException(ErrorCode errorCode, LogLevel level, String message, Throwable cause) {
		super(message, cause);
		if( message == null ) {
			message = "";
		}		
		this.errorCode = errorCode;
		LoggerContext.recordLog(errorCode, message, cause, level);
	}
	
	/**
	 * Returns the error code that was set into the object for this exception. 
	 * @return the error code that was set into the object for this exception
	 */
	public ErrorCode getErrorCode() {
		return errorCode;
	}
}
