package com.bridgelabz.userregistrationmain;

import java.util.regex.Pattern;

public class UserRegistrationMain {

	public static final String NAME_VALIDATOR = "^[A-Z]{1}[a-z]{2,}";
	public static final String NUMBER_VALIDATOR = "^[0-9]{1,3} [0-9]{10}$";
	public static final String EMAIL_VALIDATIOR = "^[a-zA-Z][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+$";
	public static final String PASSWORD_VALIDATION = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}";

	public boolean firstNameValidator(String firstName) {

		return Pattern.matches(NAME_VALIDATOR, firstName);
	}

	public boolean lastNameValidator(String lastName) {

		return Pattern.matches(NAME_VALIDATOR, lastName);
	}

	public boolean mobileNumberValidator(String mobNumber) {
		return Pattern.matches(NUMBER_VALIDATOR, mobNumber);
	}

	public boolean emailValidator(String email) {
		return Pattern.matches(EMAIL_VALIDATIOR, email);
	}

	public boolean passwordValidation(String password) {
		return Pattern.matches(PASSWORD_VALIDATION, password);
	}

	public int sum(int a, int b) {
		return a + b;
	}

}
