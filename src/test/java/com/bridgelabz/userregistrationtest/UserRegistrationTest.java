package com.bridgelabz.userregistrationtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.userregistrationmain.UserRegistrationMain;

public class UserRegistrationTest {

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest() {
		UserRegistrationMain validator = new UserRegistrationMain();
		Boolean result = validator.firstNameValidator("Navya");
		assertEquals("Happy Test Case", true, result);
	}

	@Test
	public void whenGivenLastNameShouldValidateAndPassNameValidatorTest() {
		UserRegistrationMain validator = new UserRegistrationMain();
		Boolean result = validator.lastNameValidator("Shree");
		assertEquals("Happy Test Case", true, result);
	}

	@Test
	public void whenEnteredMobileShouldValidateAndPassNumberTest1() {
		UserRegistrationMain validator = new UserRegistrationMain();
		Boolean result = validator.mobileNumberValidator("91 8097177781");
		assertEquals("Happy Test Case", true, result);
	}

	@Test
	public void whenEnteredEmailAddressShouldValidateAndPassEmailTest1() {
		UserRegistrationMain validator = new UserRegistrationMain();
		Boolean result = validator.emailValidator("navyashree121@gmail.com");
		assertEquals("Happy Test Case", true, result);
	}

	@Test
	public void whenEnteredPasswordShouldValidateAndPassTest() {
		UserRegistrationMain validator = new UserRegistrationMain();
		Boolean result = validator.passwordValidation("Anokhi5@co.in");
		assertEquals("Happy Test Case", true, result);
	}

	@Test
	public void whenGivenFirstNameShouldValidateAndPassNameValidatorTest2() {
		UserRegistrationMain validator = new UserRegistrationMain();
		Boolean result = validator.firstNameValidator("navya");
		assertEquals("Sad Test Case", true, result);
	}

	@Test
	public void whenGivenLastNameShouldValidateAndPassNameValidatorTest2() {
		UserRegistrationMain validator = new UserRegistrationMain();
		Boolean result = validator.lastNameValidator("shree");
		assertEquals("Sad Test Case", true, result);
	}

	@Test
	public void whenEnteredMobileShouldValidateAndPassNumberTest2() {
		UserRegistrationMain validator = new UserRegistrationMain();
		Boolean result = validator.mobileNumberValidator("91-8097177781");
		assertEquals("Sad Test Case", true, result);
	}

	@Test
	public void whenEnteredEmailAddressShouldValidateAndPassEmailTest2() {
		UserRegistrationMain validator = new UserRegistrationMain();
		Boolean result = validator.emailValidator("anokhi2@.gmail.com");
		assertEquals("Sad Test Case", true, result);
	}

	@Test
	public void whenEnteredPasswordShouldValidateAndPassTest2() {
		UserRegistrationMain validator = new UserRegistrationMain();
		Boolean result = validator.passwordValidation("navya123.@");
		assertEquals("Sad Test Case", true, result);
	}

	@Test
	public void test() {
		UserRegistrationMain obj = new UserRegistrationMain();
		int actual = obj.sum(20, 10);
		int expected = 30;
		assertEquals(expected, actual);
	}

}
