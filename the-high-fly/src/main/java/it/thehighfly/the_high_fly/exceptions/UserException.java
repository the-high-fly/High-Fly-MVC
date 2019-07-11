package it.thehighfly.the_high_fly.exceptions;

public class UserException extends Exception{

private String errorCode;
	
	public UserException() {
		// TODO Auto-generated constructor stub
	}

	public UserException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public UserException(Throwable cause, String errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}

	public UserException(String message, Throwable cause, String errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public UserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.errorCode = errorCode;
	}

	
}
