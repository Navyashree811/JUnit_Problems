package com.bridgelabz.userregistrationtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.userregistrationmain.InvalidUserInputException;
import com.bridgelabz.userregistrationmain.InvalidUserInputException.ExceptionType;
import com.bridgelabz.userregistrationmain.UserRegistrationMain;

public class UserRegistrationTest {

	@Test
	public void whenGivenFirstNameEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.firstNameValidator("");
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenFirstNameNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.firstNameValidator(null);
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenFirstNameWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.firstNameValidator("navya");
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenLastNameEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.lastNameValidator("");
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenLastNameNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.lastNameValidator(null);
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenLastNameWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.lastNameValidator("shree");
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.mobileNumberValidator("");
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.mobileNumberValidator(null);
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.mobileNumberValidator("5264264");
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenEmailEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.emailValidator("");
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenEmailNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.emailValidator(null);
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenEmailWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.emailValidator("navya@gmail@.com.com");
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenPasswordEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.passwordValidation("");
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenPasswordNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.passwordValidation(null);
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenPasswordWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserRegistrationMain validator = new UserRegistrationMain();
		try {
			validator.passwordValidation("navya098");
		} catch (InvalidUserInputException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

}
