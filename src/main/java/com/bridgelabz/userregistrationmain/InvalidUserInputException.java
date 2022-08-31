package com.bridgelabz.userregistrationmain;

public class InvalidUserInputException extends Exception {
	public enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY, ENTERED_WRONG;
	}

	public ExceptionType type;

	public InvalidUserInputException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
