// PasswordFieldTest.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(String)} method.
*/
class PasswordFieldTest {

	@Test
	void testGetPassword() throws IOException {
		String prompt = "Enter password: ";
		String password = "password";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] passwordArray = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(passwordArray));
		assertEquals(prompt, baos.toString());
	}
}