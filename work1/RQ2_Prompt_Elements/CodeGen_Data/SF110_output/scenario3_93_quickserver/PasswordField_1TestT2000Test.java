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
public String[] parameters;
		public static String message = "passwordfield.test";

		/**
	 * Constructor passwordfield.test.
	 */
		public PasswordField_1Test() {
			parameters = new String[]{"-password\"/some/password\"\" --input \"some/password1\" \"some/password2\"",
					"-password \"/some/password\"  --input \"some\n/password1\"  \"some\n/password2\"",
					"-password \"/some/password\"  \"some/password3\"  \"some\n/password4\""};
		}

	/**
	 * Test method for {@link PasswordField#getPassword(InputStream, String)}.
	 * It calls the constructor with the given parameters of {@link PasswordField} object and
	 * verifies the call to the method against the value returned by {@link PasswordField} object.
	*/
	@Test
		public void testGetPassword(InputStream... in) throws IOException {
			// System.out.println(message);
			passwordfield.getPassword(in, message);
			for(int i = 0; i < in.length - 1; i++) {
				passwordfield.getPassword(in[i], message);
			}
			in[in.length - 1].close();
		}

	/**
	 * Test method for {@link PasswordField#getPassword(InputStream, String)}.
	 * It checks the call without any argument, which verifies the call to the method against the
	 * method with the given argument and verifies any of the methods with the same argument return
	 * the correct information and is not an error.
	*/
	@Test
		public void testGetPasswordNoPasswordArg(InputStream... in) throws IOException {
			PasswordField object = new PasswordField();
			assertEquals(object.getPassword(in[0], ""), passwordfield.getPassword(in[0], ""));
			assertEquals(object.getPassword(in[0], object.parameters[0]), passwordfield.getPassword(in[0], object.parameters[0]));
		}
}
