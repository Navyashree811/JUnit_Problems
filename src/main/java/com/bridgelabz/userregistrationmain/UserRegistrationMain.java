/*
 * UC 13 : Refactor the code to use Lambda Function to Validate User Entry.
 */
package com.bridgelabz.userregistrationmain;

import java.util.regex.Pattern;

import com.bridgelabz.userregistrationmain.InvalidUserInputException.ExceptionType;

public class UserRegistrationMain {

	public static final String NAME = "^[A-Z]{1}[a-zA-z]{2,}$";
	public static final String PHONE_NUMBER = "^([0-9]{1,3} )?[0-9]{10}$";
	public static final String EMAIL = "^[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{1,8}.[a-zA-Z.]{2,6}";
	public static final String PASSWORD = "(?=.*[A-Z])(?=.*[@#$%^&*-_+=]){1}(?=.*[0-9])(?=.*[a-z]).{8,}";

	static UserRegistrationInterfaces firstNameValidate = fName -> {
		boolean result = Pattern.matches(NAME, fName);
		if (result) {
			return result;
		} else {
			throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_FIRST_NAME,
					"Invalid Firsrt Name");
		}
	};

	static UserRegistrationInterfaces lastNameValidate = lName -> {
		boolean result = Pattern.matches(NAME, lName);
		if (result) {
			return result;
		} else {
			throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_LAST_NAME,
					"Invalid Last Name");
		}
	};

	static UserRegistrationInterfaces emailValidate = email -> {
		boolean result = Pattern.matches(EMAIL, email);
		if (result) {
			return result;
		} else {
			throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_EMAIL, "Invalid Email");
		}
	};

	static UserRegistrationInterfaces phoneNumberValidate = phNum -> {
		boolean result = Pattern.matches(PHONE_NUMBER, phNum);
		if (result) {
			return result;
		} else {
			throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PHONE_NUMBER,
					"Invalid Phone Number");
		}
	};

	static UserRegistrationInterfaces passwordValidate = pw -> {
		boolean result = Pattern.matches(PASSWORD, pw);
		if (result) {
			return result;
		} else {
			throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PASSWORD,
					"Invalid Password");
		}
	};

	public static void main(String[] args) throws InvalidUserInputException {

		UserRegistrationInterfaces fName = firstNameValidate;
		UserRegistrationInterfaces lName = lastNameValidate;
		UserRegistrationInterfaces email = emailValidate;
		UserRegistrationInterfaces mobile = phoneNumberValidate;
		UserRegistrationInterfaces password = passwordValidate;

		System.out.println("First Name: " + fName.userEntries("Navaya"));
		System.out.println("Last Name:  " + lName.userEntries("Shree"));
		System.out.println("Email:      " + email.userEntries("abc@yahoo.co.in"));
		System.out.println("Phone Number:" + mobile.userEntries("91 9800088899"));
		System.out.println("Password: " + password.userEntries("Navyas15@"));

	}

}
