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
		} catch (IOException e) {
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
		} catch (IOException e) {
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
			ByteArrayInputStream in = new ByteArrayInputStream(new byte[0]);
			PasswordField.getPassword(in, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			assertEquals("No line found", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream contains only a new line character.
	*/
	@Test
	void testGetPassword_NewLineInputStream() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertNull(password);
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream contains only a carriage return character.
	*/
	@Test
	void testGetPassword_CarriageReturnInputStream() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("\r".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertNull(password);
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream contains only a carriage return and new line character.
	*/
	@Test
	void testGetPassword_CarriageReturnNewLineInputStream() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("\r\n".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertNull(password);
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream contains only a new line and carriage return character.
	*/
	@Test
	void testGetPassword_NewLineCarriageReturnInputStream() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("\n\r".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertNull(password);
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream contains only a new line and carriage return character.
	*/
	@Test
	void testGetPassword_InputStream() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("password\n".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertEquals("password", new String(password));
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream contains only a new line and carriage return character.
	*/
	@Test
	void testGetPassword_InputStreamWithCarriageReturn() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("password\r".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertEquals("password", new String(password));
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream contains only a new line and carriage return character.
	*/
	@Test
	void testGetPassword_InputStreamWithCarriageReturnNewLine() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("password\r\n".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertEquals("password", new String(password));
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream contains only a new line and carriage return character.
	*/
	@Test
	void testGetPassword_InputStreamWithNewLineCarriageReturn() {
		try {
			ByteArrayInputStream in = new ByteArrayInputStream("password\n\r".getBytes());
			char[] password = PasswordField.getPassword(in, "prompt");
			assertEquals("password", new String(password));
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
}