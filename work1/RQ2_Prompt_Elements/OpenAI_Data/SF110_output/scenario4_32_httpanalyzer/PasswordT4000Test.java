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
	* It tests the encryption of the password "password" with the salt "salt".
	* The expected result is "salt".
	*/
	@Test
	void testCrypt1() {
		String strpw = "password";
		String strsalt = "salt";
		String expResult = "salt";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "salt".
	* The expected result is "salt".
	*/
	@Test
	void testCrypt2() {
		String strpw = "password";
		String strsalt = "salt";
		String expResult = "salt";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "salt".
	* The expected result is "salt".
	*/
	@Test
	void testCrypt3() {
		String strpw = "password";
		String strsalt = "salt";
		String expResult = "salt";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "salt".
	* The expected result is "salt".
	*/
	@Test
	void testCrypt4() {
		String strpw = "password";
		String strsalt = "salt";
		String expResult = "salt";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "salt".
	* The expected result is "salt".
	*/
	@Test
	void testCrypt5() {
		String strpw = "password";
		String strsalt = "salt";
		String expResult = "salt";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "salt".
	* The expected result is "salt".
	*/
	@Test
	void testCrypt6() {
		String strpw = "password";
		String strsalt = "salt";
		String expResult = "salt";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "salt".
	* The expected result is "salt".
	*/
	@Test
	void testCrypt7() {
		String strpw = "password";
		String strsalt = "salt";
		String expResult = "salt";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "salt".
	* The expected result is "salt".
	*/
	@Test
	void testCrypt8() {
		String strpw = "password";
		String strsalt = "salt";
		String expResult = "salt";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "salt".
	* The expected result is "salt".
	*/
	@Test
	void testCrypt9() {
		String strpw = "password";
		String strsalt = "salt";
		String expResult = "salt";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)} method.
	* It tests the encryption of the password "password" with the salt "salt".
	* The expected result is "salt".
	*/
	@Test
	void testCrypt10() {
		String strpw = "password";
		String strsalt = "salt";
		String expResult = "salt";
		String result = Password.crypt(strpw, strsalt);
		assertEquals(expResult, result);
	}
}