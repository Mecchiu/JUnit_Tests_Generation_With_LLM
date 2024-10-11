// PasswordFieldTest.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(InputStream, String)} method.
*/
class PasswordFieldTest {

	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is null.
	*/
	@Test
	public void testGetPassword_NullInputStream() {
		try {
			PasswordField.getPassword(null, "prompt");
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// expected
		} catch (IOException e) {
			fail("NullPointerException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the prompt is null.
	*/
	@Test
	public void testGetPassword_NullPrompt() {
		try {
			PasswordField.getPassword(System.in, null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// expected
		} catch (IOException e) {
			fail("NullPointerException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the prompt is empty.
	*/
	@Test
	public void testGetPassword_EmptyPrompt() {
		try {
			PasswordField.getPassword(System.in, "");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// expected
		} catch (IOException e) {
			fail("IllegalArgumentException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not a console.
	*/
	@Test
	public void testGetPassword_NotConsole() {
		try {
			PasswordField.getPassword(new ByteArrayInputStream("password".getBytes()), "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is a console.
	*/
	@Test
	public void testGetPassword_Console() {
		try {
			PasswordField.getPassword(System.in, "prompt");
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is a console and the password is empty.
	*/
	@Test
	public void testGetPassword_Console_EmptyPassword() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertEquals(0, password.length);
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is a console and the password is not empty.
	*/
	@Test
	public void testGetPassword_Console_NotEmptyPassword() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("password\n".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertEquals(8, password.length);
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is a console and the password is not empty.
	*/
	@Test
	public void testGetPassword_Console_NotEmptyPassword_WithBackspace() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("passwor\b\bd\n".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertEquals(7, password.length);
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is a console and the password is not empty.
	*/
	@Test
	public void testGetPassword_Console_NotEmptyPassword_WithBackspace_AtStart() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("\b\bpassword\n".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertEquals(8, password.length);
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is a console and the password is not empty.
	*/
	@Test
	public void testGetPassword_Console_NotEmptyPassword_WithBackspace_AtEnd() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("password\b\b\n".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertEquals(7, password.length);
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is a console and the password is not empty.
	*/
	@Test
	public void testGetPassword_Console_NotEmptyPassword_WithBackspace_AtMiddle() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("passwor\b\bd\n".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertEquals(7, password.length);
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
}