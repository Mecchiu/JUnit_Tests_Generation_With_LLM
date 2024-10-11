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
		public final static Logger _log =
				org.junit.jupiter.api.extension.LoggerFactory.getLogger(PasswordField_1Test.class);

		/**
		 * Reads a password.
		 *
		 * @param in
		 *      The input stream to be used. It must be positioned at the beginning of the input stream.
		 * @param prompt  Prompt on the login, will be used in the "login" property of the returned
		 *    {@link PasswordField}.
		  * @throws IOException
		 *      <pre>if the stream cannot be read</pre>
		 */
		public char[] getPassword(InputStream in, String prompt) throws IOException {
			assertTrue("Stream must be positioned at beginning of the stream", in.read() == '\n' && in.read() == '\n');

			Reader reader = new BufferedReader(new InputStreamReader(in));
			String line = reader.readLine();
			assertTrue("A single new line must be read", line!= null);
			String password = line.trim();

			line = reader.readLine();  // This should not work in real environment
			assertTrue("Password cannot be empty", line!= null &&!password.trim().isEmpty());

			return password.trim().replaceAll("[\"\\n ]", "").toCharArray();
		}
}