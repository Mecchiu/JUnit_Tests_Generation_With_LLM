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
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the method with a null password.
	*/
	@Test
	void testCryptNullPassword() {
		String strpw = null;
		String strsalt = "ab";
		String expResult = null;
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the method with a null salt.
	*/
	@Test
	void testCryptNullSalt() {
		String strpw = "password";
		String strsalt = null;
		String expResult = null;
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the method with a null password and a null salt.
	*/
	@Test
	void testCryptNullPasswordAndSalt() {
		String strpw = null;
		String strsalt = null;
		String expResult = null;
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the method with a password and a null salt.
	*/
	@Test
	void testCryptPasswordAndNullSalt() {
		String strpw = "password";
		String strsalt = null;
		String expResult = null;
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the method with a null password and a salt.
	*/
	@Test
	void testCryptNullPasswordAndSalt() {
		String strpw = null;
		String strsalt = "ab";
		String expResult = null;
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the method with a password and a salt.
	*/
	@Test
	void testCryptPasswordAndSalt() {
		String strpw = "password";
		String strsalt = "ab";
		String expResult = "ab6fCkPPmQ/A2";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the method with a password and a salt.
	*/
	@Test
	void testCryptPasswordAndSalt2() {
		String strpw = "password";
		String strsalt = "ab";
		String expResult = "ab6fCkPPmQ/A2";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the method with a password and a salt.
	*/
	@Test
	void testCryptPasswordAndSalt3() {
		String strpw = "password";
		String strsalt = "ab";
		String expResult = "ab6fCkPPmQ/A2";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the method with a password and a salt.
	*/
	@Test
	void testCryptPasswordAndSalt4() {
		String strpw = "password";
		String strsalt = "ab";
		String expResult = "ab6fCkPPmQ/A2";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the method with a password and a salt.
	*/
	@Test
	void testCryptPasswordAndSalt5() {
		String strpw = "password";
		String strsalt = "ab";
		String expResult = "ab6fCkPPmQ/A2";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
}