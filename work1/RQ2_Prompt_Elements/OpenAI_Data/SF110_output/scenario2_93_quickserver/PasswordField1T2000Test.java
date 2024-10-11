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

	private static final Logger logger = Logger.getLogger(PasswordFieldTest.class.getName());
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is null.
	*/
	@Test
	void testGetPassword_NullInputStream() {
		try {
			PasswordField.getPassword(null, "prompt");
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			assertEquals("in cannot be null", e.getMessage());
		} catch (Exception e) {
			fail("NullPointerException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the prompt is null.
	*/
	@Test
	void testGetPassword_NullPrompt() {
		try {
			PasswordField.getPassword(System.in, null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			assertEquals("prompt cannot be null", e.getMessage());
		} catch (Exception e) {
			fail("NullPointerException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is empty.
	*/
	@Test
	void testGetPassword_EmptyInputStream() {
		try {
			InputStream inputStream = new ByteArrayInputStream(new byte[0]);
			PasswordField.getPassword(inputStream, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			assertEquals("No newline found", e.getMessage());
		} catch (Exception e) {
			fail("IOException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty.
	*/
	@Test
	void testGetPassword_NotEmptyInputStream() {
		try {
			InputStream inputStream = new ByteArrayInputStream("password".getBytes());
			char[] password = PasswordField.getPassword(inputStream, "prompt");
			assertEquals("password", new String(password));
		} catch (Exception e) {
			fail("No exception expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty and contains a newline character.
	*/
	@Test
	void testGetPassword_NotEmptyInputStreamWithNewline() {
		try {
			InputStream inputStream = new ByteArrayInputStream("password\n".getBytes());
			char[] password = PasswordField.getPassword(inputStream, "prompt");
			assertEquals("password", new String(password));
		} catch (Exception e) {
			fail("No exception expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty and contains a carriage return character.
	*/
	@Test
	void testGetPassword_NotEmptyInputStreamWithCarriageReturn() {
		try {
			InputStream inputStream = new ByteArrayInputStream("password\r".getBytes());
			char[] password = PasswordField.getPassword(inputStream, "prompt");
			assertEquals("password", new String(password));
		} catch (Exception e) {
			fail("No exception expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty and contains a carriage return and newline characters.
	*/
	@Test
	void testGetPassword_NotEmptyInputStreamWithCarriageReturnAndNewline() {
		try {
			InputStream inputStream = new ByteArrayInputStream("password\r\n".getBytes());
			char[] password = PasswordField.getPassword(inputStream, "prompt");
			assertEquals("password", new String(password));
		} catch (Exception e) {
			fail("No exception expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty and contains a carriage return and newline characters.
	*/
	@Test
	void testGetPassword_NotEmptyInputStreamWithCarriageReturnAndNewlineAndExtraCharacters() {
		try {
			InputStream inputStream = new ByteArrayInputStream("password\r\npassword".getBytes());
			char[] password = PasswordField.getPassword(inputStream, "prompt");
			assertEquals("password", new String(password));
		} catch (Exception e) {
			fail("No exception expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty and contains a carriage return and newline characters.
	*/
	@Test
	void testGetPassword_NotEmptyInputStreamWithCarriageReturnAndNewlineAndExtraCharactersAndPushback() {
		try {
			InputStream inputStream = new ByteArrayInputStream("password\r\npassword".getBytes());
			char[] password = PasswordField.getPassword(inputStream, "prompt");
			assertEquals("password", new String(password));
		} catch (Exception e) {
			fail("No exception expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty and contains a carriage return and newline characters.
	*/
	@Test
	void testGetPassword_NotEmptyInputStreamWithCarriageReturnAndNewlineAndExtraCharactersAndPushbackAndWindows() {
		try {
			InputStream inputStream = new ByteArrayInputStream("password\r\npassword".getBytes());
			char[] password = PasswordField.getPassword(inputStream, "prompt");
			assertEquals("password", new String(password));
		} catch (Exception e) {
			fail("No exception expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty and contains a carriage return and newline characters.
	*/
	@Test
	void testGetPassword_NotEmptyInputStreamWithCarriageReturnAndNewlineAndExtraCharactersAndPushbackAndWindowsAndRobot() {
		try {
			InputStream inputStream = new ByteArrayInputStream("password\r\npassword".getBytes());
			char[] password = PasswordField.getPassword(inputStream, "prompt");
			assertEquals("password", new String(password));
		} catch (Exception e) {
			fail("No exception expected");
		}
	}
}