// PasswordField_1Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains one unit test case for the {@link PasswordField#getPassword(InputStream, String)} method.
*/
class PasswordField_1Test {
		final static String password = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNMQ";

		/**
		 * Get a password from 'in'.
		 * @param in input stream to be used (e.g. System.in).
		 * @return The password as entered by the user.
		 */
		final static char[] getPassword(InputStream in) throws IOException;

		/**
		 * Test the password masker.
		 */
		@Test
		public void test() throws Exception {
		    char [] password = null;
			try{
				password = PasswordField.getPassword(in, password);
			}catch(RuntimeException e){
				throw e;
			}catch(Exception e){
			}
			assertTrue(password.length > 1);
			
			try{
				password = PasswordField.getPassword(in, password);
				throw new RuntimeException("Expected RuntimeException here but the method has no return value");
			}catch(Exception e){
				assertTrue(password == password);
			}
			
		}

	}