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
* It contains ten unit test cases for the {@link Password#crypt(String, String)} method.
*/
class PasswordTest {

	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "aa".
	* The expected result is "aapassword".
	*/
	@Test
	void testCrypt1() {
		String password = "password";
		String salt = "aa";
		String expected = "aapassword";
		String result = Password.crypt(password, salt);
		assertEquals(expected, result);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "ab".
	* The expected result is "abpassword".
	*/
	@Test
	void testCrypt2() {
		String password = "password";
		String salt = "ab";
		String expected = "abpassword";
		String result = Password.crypt(password, salt);
		assertEquals(expected, result);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "ac".
	* The expected result is "acpassword".
	*/
	@Test
	void testCrypt3() {
		String password = "password";
		String salt = "ac";
		String expected = "acpassword";
		String result = Password.crypt(password, salt);
		assertEquals(expected, result);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "ad".
	* The expected result is "adpassword".
	*/
	@Test
	void testCrypt4() {
		String password = "password";
		String salt = "ad";
		String expected = "adpassword";
		String result = Password.crypt(password, salt);
		assertEquals(expected, result);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "ae".
	* The expected result is "aepassword".
	*/
	@Test
	void testCrypt5() {
		String password = "password";
		String salt = "ae";
		String expected = "aepassword";
		String result = Password.crypt(password, salt);
		assertEquals(expected, result);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "af".
	* The expected result is "afpassword".
	*/
	@Test
	void testCrypt6() {
		String password = "password";
		String salt = "af";
		String expected = "afpassword";
		String result = Password.crypt(password, salt);
		assertEquals(expected, result);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "ag".
	* The expected result is "agpassword".
	*/
	@Test
	void testCrypt7() {
		String password = "password";
		String salt = "ag";
		String expected = "agpassword";
		String result = Password.crypt(password, salt);
		assertEquals(expected, result);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "ah".
	* The expected result is "ahpassword".
	*/
	@Test
	void testCrypt8() {
		String password = "password";
		String salt = "ah";
		String expected = "ahpassword";
		String result = Password.crypt(password, salt);
		assertEquals(expected, result);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "ai".
	* The expected result is "aipassword".
	*/
	@Test
	void testCrypt9() {
		String password = "password";
		String salt = "ai";
		String expected = "aipassword";
		String result = Password.crypt(password, salt);
		assertEquals(expected, result);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "aj".
	* The expected result is "ajpassword".
	*/
	@Test
	void testCrypt10() {
		String password = "password";
		String salt = "aj";
		String expected = "ajpassword";
		String result = Password.crypt(password, salt);
		assertEquals(expected, result);
	}
}