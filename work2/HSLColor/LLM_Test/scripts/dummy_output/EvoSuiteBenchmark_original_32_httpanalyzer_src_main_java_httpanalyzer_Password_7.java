// PasswordTest.java
package httpanalyzer;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Password}.
* It contains one unit test case for the {@link Password#crypt(String, String)} method.
*/
class PasswordTest {
		/**
 		 * Test the password, when both salt and string are given.
		* Note that the salt string needs to be 6 characters plus the letter
		* 'A' character since the password is to be generated with the salt first.
		 */
		@Test
		@SuppressWarnings("unused")	// to keep compiler from complaining about unused parameter
		public void test() {
			// Test 1: when both salts are given
			// It is not possible to crypt passwords using the plain text password
			// We just need to compare the plain text password.
			String plaintextPassword = "Hello World!";
			String cryptedPassword = Password.crypt(plaintextPassword, "A");
			assertEquals("The password does not match", plaintextPassword, cryptedPassword);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {}
		}
}

// ExceptionTest.java