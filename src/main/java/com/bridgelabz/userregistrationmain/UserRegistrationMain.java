package com.bridgelabz.userregistrationmain;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationMain {

	private final String NAME_VALIDATOR = "^[A-Z]{1}[a-z]{2,}$";
	private final String LAST_NAME_VALIDATOR = "^[A-Z]{1}[a-z]{2,}$";
	private final String EMAIL_VALIDATOR = "^[a-zA-Z][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+$";
	private final String MOBILE_NUM_VALIDATOR = "^[0-9]{1,3} [0-9]{10}$";
	private final String PASSWORD_RULE1_VALIDATOR = "[a-z]{8,}";
	private final String PASSWORD_RULE2_VALIDATOR = "[A-Z]{1,}[a-z]{8,}";
	private final String PASSWORD_RULE3_VALIDATOR = "[a-z A-z 0-9]{8,}";
	private final String PASSWORD_RULE4_VALIDATOR = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}";
	static Scanner sc = new Scanner(System.in);

	public static boolean firstNameValidator() {
		UserRegistrationMain uservalidate = new UserRegistrationMain();
		System.out.println("Enter the first name: ");
		String fName = UserRegistrationMain.sc.nextLine();
		return Pattern.matches(uservalidate.NAME_VALIDATOR, fName);
	}

	public static boolean lastNameValidator() {
		UserRegistrationMain uservalidate = new UserRegistrationMain();
		System.out.println("Enter the Last name: ");
		String lName = UserRegistrationMain.sc.nextLine();
		return Pattern.matches(uservalidate.LAST_NAME_VALIDATOR, lName);
	}

	public static boolean emailValidator(String email2Test) {
		UserRegistrationMain uservalidate = new UserRegistrationMain();
		System.out.println("Enter the Email address: ");
		String email = UserRegistrationMain.sc.nextLine();
		return Pattern.matches(uservalidate.EMAIL_VALIDATOR, email);
	}

	public static boolean mobNumValidator() {
		UserRegistrationMain uservalidate = new UserRegistrationMain();
		System.out.println("Enter the Mobile number: ");
		String mobNum = UserRegistrationMain.sc.nextLine();
		return Pattern.matches(uservalidate.MOBILE_NUM_VALIDATOR, mobNum);
	}

	public static boolean password1Validator() {
		UserRegistrationMain uservalidate = new UserRegistrationMain();
		System.out.println("Enter the Password: ");
		String password1 = UserRegistrationMain.sc.nextLine();
		return Pattern.matches(uservalidate.PASSWORD_RULE1_VALIDATOR, password1);
	}

	public static boolean password2Validator() {
		UserRegistrationMain uservalidate = new UserRegistrationMain();
		System.out.println("Enter the Password 2: ");
		String password2 = UserRegistrationMain.sc.nextLine();
		return Pattern.matches(uservalidate.PASSWORD_RULE2_VALIDATOR, password2);
	}

	public static boolean password3Validator() {
		UserRegistrationMain uservalidate = new UserRegistrationMain();
		System.out.println("Enter the Password 3: ");
		String password3 = UserRegistrationMain.sc.nextLine();
		return Pattern.matches(uservalidate.PASSWORD_RULE3_VALIDATOR, password3);
	}

	public static boolean password4Validator() {
		UserRegistrationMain uservalidate = new UserRegistrationMain();
		System.out.println("Enter the Password 4: ");
		String password4 = UserRegistrationMain.sc.nextLine();
		return Pattern.matches(uservalidate.PASSWORD_RULE4_VALIDATOR, password4);
	}

	String[] validEmail = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };
	String[] invalidEmail = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
			"abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
			"abc@gmail.com.1a", "abc@gmail.com.aa.au" };
	{
		for (String value : validEmail) {
			System.out.println(value);
			System.out.println(Pattern.matches(
					"^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",
					value));
		}
		for (String s : invalidEmail) {
			System.out.println(s);
			System.out.println(Pattern.matches(
					"^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",
					s));
		}
	}
}
