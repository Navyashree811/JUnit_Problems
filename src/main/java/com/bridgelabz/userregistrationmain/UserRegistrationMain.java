/*
 * UC 12 : Refactor the code to throw custom exceptions in case of invalid user Details .
 */
package com.bridgelabz.userregistrationmain;

import java.util.regex.Pattern;

import com.bridgelabz.userregistrationmain.InvalidUserInputException.ExceptionType;

public class UserRegistrationMain {

	public static final String NAME_VALIDATOR = "^[A-Z]{1}[a-zA-z]{2,}$";
	public static final String NUMBER_VALIDATOR = "^[0-9]{2}[ ]{1}[0-9]{10}$";
	public static final String EMAIL_VALIDATOR = "^[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{1,8}.[a-zA-Z.]{2,6}";
	public static final String PASSWORD_VALIDATION = "(?=.*[A-Z])(?=.*[@#$%^&*-_+=]){1}(?=.*[0-9])(?=.*[a-z]).{8,}";

	public boolean firstNameValidator(String firstName) throws InvalidUserInputException {
		try {
			if (firstName.length() == 0) {
				throw new InvalidUserInputException(ExceptionType.ENTERED_EMPTY, "First Name should not be Empty.");
			} else if (Pattern.matches(NAME_VALIDATOR, firstName) == false) {
				throw new InvalidUserInputException(ExceptionType.ENTERED_WRONG, "Entered First Name is Wrong.");
			}
		} catch (NullPointerException e) {
			throw new InvalidUserInputException(ExceptionType.ENTERED_NULL, "First Name cannot be NULL.");
		}
		return Pattern.matches(NAME_VALIDATOR, firstName);
	}

	public boolean lastNameValidator(String lastName) throws InvalidUserInputException {
		try {
			if (lastName.length() == 0) {
				throw new InvalidUserInputException(ExceptionType.ENTERED_EMPTY, "Last Name should not be Empty.");
			} else if (Pattern.matches(NAME_VALIDATOR, lastName) == false) {
				throw new InvalidUserInputException(ExceptionType.ENTERED_WRONG, "Entered Last Name is Wrong.");
			}
		} catch (NullPointerException e) {
			throw new InvalidUserInputException(ExceptionType.ENTERED_NULL, "Last Name cannot be NULL.");
		}
		return Pattern.matches(NAME_VALIDATOR, lastName);
	}

	public boolean mobileNumberValidator(String mobNumber) throws InvalidUserInputException {
		try {
			if (mobNumber.length() == 0) {
				throw new InvalidUserInputException(ExceptionType.ENTERED_EMPTY, "Mobile Number should not be Empty.");
			} else if (Pattern.matches(NUMBER_VALIDATOR, mobNumber) == false) {
				throw new InvalidUserInputException(ExceptionType.ENTERED_WRONG, "Entered Mobile Number is Wrong.");
			}
		} catch (NullPointerException e) {
			throw new InvalidUserInputException(ExceptionType.ENTERED_NULL, "Mobile Number cannot be NULL.");
		}
		return Pattern.matches(NUMBER_VALIDATOR, mobNumber);
	}

	public boolean emailValidator(String email) throws InvalidUserInputException {
		try {
			if (email.length() == 0) {
				throw new InvalidUserInputException(ExceptionType.ENTERED_EMPTY, "Email should not be Empty.");
			} else if (Pattern.matches(EMAIL_VALIDATOR, email) == false) {
				throw new InvalidUserInputException(ExceptionType.ENTERED_WRONG, "Entered Email is Wrong.");
			}
		} catch (NullPointerException e) {
			throw new InvalidUserInputException(ExceptionType.ENTERED_NULL, "Email cannot be NULL.");
		}
		return Pattern.matches(EMAIL_VALIDATOR, email);
	}

	public boolean passwordValidation(String password) throws InvalidUserInputException {
		try {
			if (password.length() == 0) {
				throw new InvalidUserInputException(ExceptionType.ENTERED_EMPTY, "PASSWORD should not be Empty.");
			} else if (Pattern.matches(PASSWORD_VALIDATION, password) == false) {
				throw new InvalidUserInputException(ExceptionType.ENTERED_WRONG, "Entered PASSWORD is Wrong.");
			}
		} catch (NullPointerException e) {
			throw new InvalidUserInputException(ExceptionType.ENTERED_NULL, "PASSWORD cannot be NULL.");
		}
		return Pattern.matches(PASSWORD_VALIDATION, password);
	}
}
