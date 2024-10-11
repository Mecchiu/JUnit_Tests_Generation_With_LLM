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

	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	* It tests the case when the password is null.
	*/
	@Test
	public void testGetPassword_Null() throws IOException {
		String password = null;
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] result = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(result));
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	* It tests the case when the password is empty.
	*/
	@Test
	public void testGetPassword_Empty() throws IOException {
		String password = "";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] result = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(result));
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	* It tests the case when the password is a single character.
	*/
	@Test
	public void testGetPassword_SingleChar() throws IOException {
		String password = "a";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] result = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(result));
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	* It tests the case when the password is a multiple characters.
	*/
	@Test
	public void testGetPassword_MultipleChars() throws IOException {
		String password = "abc";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] result = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(result));
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	* It tests the case when the password is a single digit.
	*/
	@Test
	public void testGetPassword_SingleDigit() throws IOException {
		String password = "1";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] result = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(result));
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	* It tests the case when the password is multiple digits.
	*/
	@Test
	public void testGetPassword_MultipleDigits() throws IOException {
		String password = "123";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] result = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(result));
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	* It tests the case when the password is a single special character.
	*/
	@Test
	public void testGetPassword_SingleSpecialChar() throws IOException {
		String password = "!";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] result = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(result));
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	* It tests the case when the password is multiple special characters.
	*/
	@Test
	public void testGetPassword_MultipleSpecialChars() throws IOException {
		String password = "!@#$";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] result = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(result));
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	* It tests the case when the password is a single alphanumeric character.
	*/
	@Test
	public void testGetPassword_SingleAlphaNumericChar() throws IOException {
		String password = "a1";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] result = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String(result));
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(String)} method.
	* It tests the case when the password is multiple alphanumeric characters.
	*/
	@Test
	public void testGetPassword_MultipleAlphaNumericChars() throws IOException {
		String password = "a1b2c3";
		String prompt = "Enter password: ";
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
		
		ByteArrayInputStream bais = new ByteArrayInputStream(password.getBytes());
		System.setIn(bais);
		
		char[] result = PasswordField.getPassword(prompt);
		
		assertEquals(password, new String