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
		// Constants
		protected final String PW1 = "abcdefgab";
		protected final String PW2 = "12345678901234567890";

		protected String Password1;
		protected String Password2;

		/**
		 * Constructs a class with a single unit test case for
		 * {@link Password#crypt(String, String)}
		 */
		public PasswordTest () {
				Password1 = Password1.substring(0,1);
				Password2 = PW2.substring(0,1);
		}

		/**
		 * Runs the method test
		 *
		 * @throws Exception any exceptions
		*/
		@Test
		public void test1 () throws Exception {  
				String result = Password.crypt(this.Password1, this.Password2);
				assertEquals(result, this.Password1.concat(result.substring(this.Password2.length())));
		}

		 /**
		 * Runs the method test
		 *
		 * @throws Exception any exceptions
		*/
		@Test
		public void test2 () throws Exception {
				String result1 = Password.crypt(this.Password1,this.Password2);
				String result2 = Password.crypt(this.Password1,this.Password2);
				assertEquals(result1.concat(result2), this.Password1.concat(result2));
		}

}