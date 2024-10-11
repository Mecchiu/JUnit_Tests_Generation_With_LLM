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
			logger.info("NullPointerException expected");
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
			logger.info("NullPointerException expected");
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
			InputStream inputStream = new ByteArrayInputStream(new byte[0]);
			PasswordField.getPassword(inputStream, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			logger.info("IOException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the prompt is empty.
	*/
	@Test
	void testGetPassword_EmptyPrompt() {
		try {
			PasswordField.getPassword(System.in, "");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			logger.info("IllegalArgumentException expected");
		} catch (IOException e) {
			fail("IllegalArgumentException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty.
	*/
	@Test
	void testGetPassword_NotEmptyInputStream() {
		try {
			InputStream inputStream = new ByteArrayInputStream(new byte[1]);
			PasswordField.getPassword(inputStream, "prompt");
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the prompt is not empty.
	*/
	@Test
	void testGetPassword_NotEmptyPrompt() {
		try {
			PasswordField.getPassword(System.in, "prompt");
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty and the prompt is not empty.
	*/
	@Test
	void testGetPassword_NotEmptyInputStreamAndNotEmptyPrompt() {
		try {
			InputStream inputStream = new ByteArrayInputStream(new byte[1]);
			PasswordField.getPassword(inputStream, "prompt");
		} catch (IOException e) {
			fail("IOException not expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is empty and the prompt is empty.
	*/
	@Test
	void testGetPassword_EmptyInputStreamAndEmptyPrompt() {
		try {
			InputStream inputStream = new ByteArrayInputStream(new byte[0]);
			PasswordField.getPassword(inputStream, "");
			fail("IOException expected");
		} catch (IOException e) {
			logger.info("IOException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is empty and the prompt is not empty.
	*/
	@Test
	void testGetPassword_EmptyInputStreamAndNotEmptyPrompt() {
		try {
			InputStream inputStream = new ByteArrayInputStream(new byte[0]);
			PasswordField.getPassword(inputStream, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			logger.info("IOException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not empty and the prompt is empty.
	*/
	@Test
	void testGetPassword_NotEmptyInputStreamAndEmptyPrompt() {
		try {
			InputStream inputStream = new ByteArrayInputStream(new byte[1]);
			PasswordField.getPassword(inputStream, "");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			logger.info("IllegalArgumentException expected");
		} catch (IOException e) {
			fail("IllegalArgumentException expected");
		}
	}
	
}