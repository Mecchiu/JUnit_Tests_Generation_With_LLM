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
		/** The log used to log information about all tests. */
    private final Logger log;
			/** Log object used to log information about tests. */
        private final Log logInfo;

				/**
				 * @param in input stream to be used (e.g. System.in)
				 * @param prompt The prompt to display to the user.
				 */
		public PasswordField_1Test(InputStream in, String prompt) throws IOException {
            log = Logger.getLogger(getClass().getName() + "." + PasswordField_1Test.class);
            logInfo = Logger.getLogger("");
        }

        /**
		 * @throws IOException an unhandled exception occurs when the input stream does not be a valid input stream.
		 */
        @Test
		public void passwordFieldNotReadable() throws IOException {
            logInfo.log("pass field to test, no readability");
            InputStream in = new FileInputStream("passfield2.txt");
            assertFalse("The input stream is neither an input stream, nor a valid input stream.", in!= null);
            try {
            	log.log(Level.WARNING, "Test in passfield not readable");
                passwordField.getPassword(in, "Please enter a password from the password field.");
            }
            catch (IOException e) {
                assertTrue("The exception is expected to be the type of InputStream.", e.getClass().equals(IOException.class));
            }
            assertTrue("Test should've been able to read the password from the prompt.", in.read() == (char)0);
        }

		/**
		 * @throws IOException an unhandled exception occurs when the input stream does not contain the provided password.
		 */
        @Test
		public void passwordFieldReadable() throws IOException {
            log.log("pass field to test, readable password");
            InputStream in = new FileInputStream("passfield2.txt");
            passwordField.getPassword(in, "Please enter a password from the password field.");
            assertTrue("Invalid password did not trigger the readability.", in.read() == (char)0);
        }

		/**
             Test method to test if the getPassword of the input stream is returning an empty string.
             @throws IOException A problem occurs when the input stream is not readable.
             @since 1.4
             */
        @Test
		public void passwordField_1() throws IOException {
            log.log("The password field is empty.");
            InputStream in = new FileInputStream("passfield2_empty.txt");
            byte[][] password = passwordField.getPassword(in);
            assertNotNull("The password is null.", password);
            assertFalse("The password is empty.", new String(password).isEmpty());
        }

		/**
		 * @throws IOException An unexpected exception occurs when the input stream is
		 *                   not valid for the username. A parameter is not set.
		 */
		@Test
		public void passwordField_2() throws IOException {
			try {
				log.log(Level.WARNING, "The input stream is null.");
				InputStream in = new FileInputStream("passfield2.txt");
				passwordField.getPassword(in, "Bad password.");
            }
			catch (Error e) {
				assertEquals("The exception is expected to be the type of IOException.", IOException.class, e.getClass());
    		}
		}

		/**
		 * @throws IOException An unexpected exception occurs when the input stream is
		 *                   not valid for the password. A parameter is not set.
		 */
        @Test
		public void passwordField_3() throws Exception {
            log.log("The input stream is null.");
            InputStream in = new FileInputStream("passfield2_2.txt");
            passwordField.getPassword(in, "Bad password.");
            fail("The test must fail because password field contains an invalid password.");
        }

		/**
		 * @throws IOException An unhandled exception occurs when the input stream is an invalid password. A
		 *                   parameter is not set.
		 */
        @Test
		public void passwordField_4() throws Exception {
            log.log(" The input stream contains an invalid password.");
        }

        /**
         * @throws IOException An unhandled exception occurs when the input stream is an invalid password. A
         *    parameter is not set.
         */
        @Test
        public void passwordField_5() throws IOException {
            log.log("The input stream contains an invalid password.");
        }

		/**
		 * @throws IOException An unhandled exception occurs when the input stream is an invalid password. A
        parameter is not set.
		 */
        @Test
        public void passwordField_6() throws IOException {
            logInfo.log("The input stream contains an invalid password.");
        }
		
        /**
         * @throws IOException An unhandled exception occurs when the input stream is an invalid password. A
         *     parameter is not set.
         */
        @Test
        public void passwordField_7() throws IOException {
            logInfo.log("The input stream contains an invalid password.");
        }
}