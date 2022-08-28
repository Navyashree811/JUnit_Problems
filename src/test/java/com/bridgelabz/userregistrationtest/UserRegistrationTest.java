package com.bridgelabz.userregistrationtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.userregistrationmain.UserRegistrationMain;

public class UserRegistrationTest {

	@Test
	public void givenFirstNameShouldReturnTrue() {
		assertEquals(true, UserRegistrationMain.firstNameValidator());
	}

	@Test
	public void lastNameTestValidator() {
		assertEquals(true, UserRegistrationMain.lastNameValidator());
	}

//	@Test
//	public void emailTestValidator() {
//		assertEquals(true, UserRegistrationMain.emailValidator());
//	}

	@Test
	public void password1Validator() {
		assertEquals(true, UserRegistrationMain.password1Validator());
	}

	@Test
	public void password2Validator() {
		assertEquals(true, UserRegistrationMain.password2Validator());
	}

	@Test
	public void password3Validator() {
		assertEquals(true, UserRegistrationMain.password3Validator());
	}

	@Test
	public void password4Validator() {
		assertEquals(true, UserRegistrationMain.password4Validator());
	}

}
