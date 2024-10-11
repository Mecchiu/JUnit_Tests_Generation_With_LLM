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
		private static final Logger LOG = Logger.getLogger(PasswordTest.class.getName());

	/**
	 * Tests a crypt of no password.
	 * @throws Exception
	 */
	@Test
    public void testNoPassword() throws Exception {

        Password.crypt(null, "");
        Password.crypt("", "");
        Password.crypt(null, null);
        Password.crypt(null, "");

		if (LOG.isLoggable(Level.INFO)) {
			LOG.info("No password test PASS", segv());
		}
	}

	/**
	* Tests a crypt of the password which is longer than the 32 character
	* password set in the password configuration file.
	* @throws Exception 
	*/
  @Test
    public void testPasswordTooLong() throws Exception {

        StringBuilder password = new StringBuilder(32);
        password.append("12345678");
        password.append("a");
        assertThrows(IllegalArgumentException.class, () -> {
			Password.crypt(password.toString(), "");
		}, StringBuilder.class, null);

        password.append("12345678");
        password.append("a");
        Password.crypt(password.toString(), "");
        password.append("12345678");
        password.append("a");
        assertThrows(IllegalArgumentException.class, () -> {
			Password.crypt(password.toString(), "");
		}, StringBuilder.class, null);

    }

    /**
     * Tests a crypt of the password which is a character from 00-9 which is illegal.
     * @throws Exception
     */
    @Test
    public void testInvalidCharacter() throws Exception {

        StringBuilder password = new StringBuilder(32);
        password.append("12345678");
        password.append("abcde");
        Password.crypt(password.toString(), "");
        password.append("12345678");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("123");

        if (LOG.isLoggable(Level.INFO)) {
            LOG.info("Invalid character test PASS", segv());
        }

    }
    private static final String PASSPHRASE="1j4s0RdN"; // Test PASSPHRASE

    /**
    * Tests a crypt of the password which is a character from 00-9 which is
    * illegal.
    * 
    * @throws Exception
    */
    @Test
    public void testInvalidCharacterWithPasv_N() throws Exception {

        StringBuilder password = new StringBuilder(32);
        password.append("12345678");
        password.append("abcde");
        Password.crypt(password.toString(), "");
        password.append("12345678");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("1j4s0RdN");

        Password.crypt(password.toString(), "");
        password.append("12345678");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("23j4s0RdN");

        password.append("");
        password.append("12345678");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("1j4s0RdN");

        password.append("");
        password.append("23456789");
        password.append("");
        password.append("12345678");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("2345678");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("1j4s0RdN");

        password.append("");
        password.append("234567891234");
        password.append("56789");
        password.append("12345678123456789");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("1j4s0RdN");

        password.append("");
        password.append("3456789");
        password.append("56789");
        password.append("12345");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("1j4s0RdN");

        password.append("");
        password.append("34567891234123456789");
        password.append("56789");
        password.append("123451234566");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("23j4s0RdN");

        password.append("");
        password.append("3456789123412345678");
        password.append("56789");
        password.append("12345");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("1j4s0RdN");

        password.append("");
        password.append("");
        password.append("");
        password.append("");
        password.append("");

        if (LOG.isLoggable(Level.INFO)) {
            LOG.info("Invalid character test PASS", segv());
        }

    }
    private static final String PASSPHRASEa= "a1j4s0rb"; // Test PASSPHRASE

    /**
    * Tests a crypt of the password which is a character from 00-9 which is
    * illegal.
    * 
    * @throws Exception
    */
    @Test
    public void testInvalidCharacterWithPasv_R() throws Exception {

        StringBuilder password = new StringBuilder(32);
        password.append("12345678");
        password.append("abcde");
        Password.crypt(password.toString(), "");
        password.append("12345678");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("1j4s0rb");

        Password.crypt(password.toString(), "");
        password.append("12345678");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("1j4s0xrbn");

        password.append("");
        password.append("12345");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("1j4rboRdN");

        password.append("");
        password.append("12345678");
        password.append("abcde");
        password.append("3");
        password.append("");
        password.append("1jrboRdN");

        password.append("");
        password.append("23456789");
        password.append("56789");
        password.append("12345");
        password.append("abcde");
        password.append("3");
}
}