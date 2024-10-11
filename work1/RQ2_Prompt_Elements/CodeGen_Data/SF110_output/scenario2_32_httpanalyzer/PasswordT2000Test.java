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
private final String STR = "The quick brown fox!";

        private static final Logger LOG
                = Logger.getLogger(PasswordTest.class.getName());

        static final String[] MESSAGE_TYPES = {
                "Type: Password."
        };

		@Test
		public void test( ) {
			/*
			 * Test 1, using default algorithm.
			 */
			try {
				Password pw = Password.crypt(STR, "md5");
				LOG.log(Level.INFO, "String result: '"
						+ String.valueOf(pw.hashString(STR)) + "'");
				assertEquals(pw.hashString(STR), STR);
			} catch (NoSuchAlgorithmException e) {
				LOG.log(Level.FINE, "No such algorithm");
			}
			/*
			 * Test 2, using MD5 algorithm
			 */
			try {
				MessageDigest md = MessageDigest.getInstance("md5");
				String pw1 = String.valueOf(pw.hashPassword(STR));
				String pw2 = String.valueOf(pw.hashPassword("md5", 0, STR.length()));
				LOG.log(String.format("Password result1: %s", pw1));
				LOG.log(String.format("Password result2: %s", pw2));
				assertFalse("Results should not match", 
						pw1.equals(pw2));
				try {
					pw.hashPassword("md5", 0, (pw1.length() + 1));
					LOG.log(String.format("Result of call to hashPassword failed"));
				} catch (NoSuchAlgorithmException e) {
					LOG.log(Level.FINE,
						"No such algorithm, call to hashPassword() failed");
				}
			} catch (NoSuchAlgorithmException e) {
				LOG.log(Level.FINE, "No such algorithm, call to hashPassword() failed");
			}
		}

		/**
			 * 
		*/
		public static final String etr[] = {
				"2bf2d9a0d8cac0836a89089d084d35e",
				"0b0d5ce6b7da1f5b95a067af48c9b27f",
				"6db3eb1a977e0874eee4c6b8b3e1586d",
				"c058da9cab2a1ad90738d6ab49d99ddd",
				"39d66445cea82af79a2c1d5bd818ed1c",
				"9ab9f7b2c0cfb64cf1fef98b8b4db3a1",
				"9f9af7b2c0cfb64cf1fef98b8b4db3a",
				"9f9af7b2c0cfb64cf1fef98b8b4db3b",
				"9f9af7b2c0cfb64cf1fef98b8b4dbd"
		};

}
