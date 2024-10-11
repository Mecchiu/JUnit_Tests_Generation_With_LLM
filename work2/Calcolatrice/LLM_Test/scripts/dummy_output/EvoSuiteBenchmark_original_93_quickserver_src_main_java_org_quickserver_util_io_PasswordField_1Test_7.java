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
		/**
		 * A test case to check the use of the default password of the class.
		 * I.e. a user can read a string with a default password but 
		 * not an input of its own type.
		 */
		@Test
		public void password_is_None_for_read_no_mask() throws Exception {
			InputStream in;
			in = new ByteArrayInputStream("hello".getBytes());
			try {
				String res = new PasswordField_1().getPassword(in, null);
				assertEquals("hello", res.trim());
			} catch (IOException ex) {ex.printStackTrace(); }
		}

		/**
		 * A test case to check the use of the mask password of the class.
		 * I.e. a user can read an input by masking its password
		 * by a previous mask.
		 */
		@Test
		public void password_is_MaskedIn_mask_for_read() throws Exception {
			InputStream in;
			in = new ByteArrayInputStream("hello".getBytes());
			Password mask = new Password();
			assertEquals("hello", new PasswordField_1().getPassword(in, mask));
		}

	/**
	 * A test case to check the use of the default password of the class.
	 * I.e. a user can read a string with a default password and
	 * not an input of its own type.
	 */
		@Test
		public void password_is_NonDefault_for_read_with_default() throws Exception {
			InputStream in;
			in = new ByteArrayInputStream("hello".getBytes());
			Password res = new Password();
			String res2;
			res2 = new PasswordField_1().getPassword(in, res);
			assertTrue(res2 + "=" + new String(res.getPassword()));              
		}

		/**
		 * A test case to check the use of the mask password of the class.
		 * I.e. a user can read an input by masking its password
		 * by the mask.
		 */
		@Test
		public void password_is_MaskedIn_mask_for_read_with_mask() throws Exception {
			InputStream in;
			in = new ByteArrayInputStream("hello".getBytes());
			Password mask = new Password();
			PasswordField res = new PasswordField_1();
			String res2 = res.getPassword(mask);
			assertTrue(res2 + "=" + new String(mask.getPassword()));              
		}
}
// PasswordField_1.java