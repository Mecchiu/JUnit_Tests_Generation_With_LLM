// PasswordField_0Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains one unit test case for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordField_0Test {
		private final static boolean TESTABLE = true;

		private final static String PREFIX = getClass().getName();
		private final static String SUFFIX = ".pass";

	/**
	 * This test case demonstrates the use of the interface
	 * {@link PasswordField} as a container to return the password
     * in the password field.
	 *
	 * @jira_ticket JIRA: IDENTIFIER - PASSCRYPT_TEST
	 * @jira_ticket JIRA: IDENTIFIER - PASSCRYPT_TEST
     */
	@Test
	public void test_getPassword() throws IOException {
		String password = PasswordField.getPassword(true, PREFIX + "." + SUFFIX);
		assertNotNull(password);
	}

	/**
	 * This test case demonstrates the use of the interface
	 * {@link PasswordField} as a container to return the password
	 * in the password field.
	 *
	 * @jira_ticket JIRA: IDENTIFIER - PASSCRYPT_TEST
     */
	@Test
	public void test_getPasswordNoSuffix() throws IOException {
		String password = PasswordField.getPassword(true);
		assertNotNull(password);
	}

	// PasswordField_0Test.java ends here.
}