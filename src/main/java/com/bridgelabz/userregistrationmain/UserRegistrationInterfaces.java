/*
 * Function Interface for UserRegistration
 */
package com.bridgelabz.userregistrationmain;

@FunctionalInterface
public interface UserRegistrationInterfaces {

	public boolean userEntries(String value) throws InvalidUserInputException;

}
