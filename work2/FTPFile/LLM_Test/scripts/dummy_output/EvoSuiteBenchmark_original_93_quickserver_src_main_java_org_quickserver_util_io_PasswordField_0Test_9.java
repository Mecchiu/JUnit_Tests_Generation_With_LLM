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
		
	/**
	* Empty array to store the chars read from the reader.
	*/
	private static final char[][] EMPTY_VALUES = new char[0][];

	/**
	* Tests reading a password from stdin.
	*/
	@Test
	public void read_stdin() {
		char[] password = PasswordField.getPassword("Enter the password");
		assertArrayEquals(password, PasswordField.EMPTY_VALUES);
	}
	
	// Private variables ---------------------------------------------------------------
	private final String password = "secret";
	
	/**
	* Simple check if we have the same chars used for the password.
	* Asserts are done for equality for all elements of this array.
	*/
	@Test
	public void read_same_chars() {
		char[] password = PasswordField.getPassword(password);
		assertArrayEquals(password, PasswordField.EMPTY_VALUES);
		
		password = Arrays.copyOf(password, password.length);
		password = PasswordField.getPassword(password);
		assertArrayEquals(password, PasswordField.EMPTY_VALUES);
	}
	
	// Methods --------------------------------------------------------------
	
	@Test
	public void testRead_withMask() throws Exception {
		char[] password = PasswordField.getPassword("* * "); // 0x60
		assertArrayEquals(password, PasswordField.EMPTY_VALUES);
		char[] mask = new char[password.length];
		Arrays.fill(mask, 'X');
		password = PasswordField.getPassword(mask);
		assertArrayEquals(password, new char[password.length + mask.length]);
	}
	
	@Test
	public void testReadPasswordFile() throws Exception {
		
		char[] password = PasswordField.readPasswordFile("Passwordfile"); // 
		assertArrayEquals(password, PasswordField.EMPTY_VALUES);
		
		password = PasswordField.readPasswordFile("passwordfile"); // 
		assertArrayEquals(password, new char[password.length]);
		
	}
	
	private final String[] maskedPassword = new String[0];

	/**
	* Tests reading a password which is masked of the password provided.
	*/
	@Test
	public void readsPasswordFromFile() throws Exception {
		
		char[] password = PasswordField.readPasswordFile("Passwordfile"); // 
		char[] mask = PasswordField.getPassword(password); // 0x00
		assertArrayEquals(password, mask);
		
		password = PasswordField.readPasswordFile("passwordfile"); // 
		password = PasswordField.getPassword(password); // 0xEF
		password = new char[password.length];
		Arrays.fill(password, 0xFF);
		assertArrayEquals(password, PasswordField.getPassword(mask));
	}
	
	// Private classes ----------------------------------------------------------
	
	private static final class StringHolder {
		private final String string;
		private boolean modified;
		String Hashed = "";
		String HashedEmpty = "";
		String[] maskedPassword;
		
		private StringHolder(String string) throws IOException {
			this.string= string;
			this.modified= false;
		}
		
		public void setCleanup() {
			if (modified) Hashed = Hashed!= null? Hashed : HashedEmpty;
			String password = hashed(string);
			this.maskedPassword = Arrays.copyOf(password.toCharArray(), password.length());
		}
		
		public boolean isModified() {
			return modified;
		}
		
		public String hash() {
			boolean modified = this.modified;
			char[] hashed = new char[Hashed.length()];
			for (int i=0; i<hashed.length; i++) {
				hashed[i]= (char) ((hashed.length > 1)? password.charAt(i) : password.charAt(i+1));
			}
			String masked = hashed;
			hashed = new char[masked.length()];
			char[] password = maskPassword(masked);
			for (int i=0; i<hashed.length; i++) {
				hashed[i]= password[i];
			}
			hashed = new char[hashed.length + masked.length()];
			System.arraycopy(hashed, 0, hashed, 0, masked.length());
			System.arraycopy(masked, 0, hashed, 0, masked.length());
			return new String(hashed);
		}
	}
}