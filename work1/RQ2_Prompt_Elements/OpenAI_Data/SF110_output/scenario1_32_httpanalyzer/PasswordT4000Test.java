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
	* The test case is based on the example from the assignment.
	*/
	@Test
	void testCrypt() {
		String password = "password";
		String salt = "HX";
		String expected = "HX9LLTdc/jiDE";
		String actual = Password.crypt(password, salt);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* The test case is based on the example from the assignment.
	*/
	@Test
	void testCrypt2() {
		String password = "password";
		String salt = "HX";
		String expected = "HX9LLTdc/jiDE";
		String actual = Password.crypt(password, salt);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* The test case is based on the example from the assignment.
	*/
	@Test
	void testCrypt3() {
		String password = "password";
		String salt = "HX";
		String expected = "HX9LLTdc/jiDE";
		String actual = Password.crypt(password, salt);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* The test case is based on the example from the assignment.
	*/
	@Test
	void testCrypt4() {
		String password = "password";
		String salt = "HX";
		String expected = "HX9LLTdc/jiDE";
		String actual = Password.crypt(password, salt);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* The test case is based on the example from the assignment.
	*/
	@Test
	void testCrypt5() {
		String password = "password";
		String salt = "HX";
		String expected = "HX9LLTdc/jiDE";
		String actual = Password.crypt(password, salt);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* The test case is based on the example from the assignment.
	*/
	@Test
	void testCrypt6() {
		String password = "password";
		String salt = "HX";
		String expected = "HX9LLTdc/jiDE";
		String actual = Password.crypt(password, salt);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* The test case is based on the example from the assignment.
	*/
	@Test
	void testCrypt7() {
		String password = "password";
		String salt = "HX";
		String expected = "HX9LLTdc/jiDE";
		String actual = Password.crypt(password, salt);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* The test case is based on the example from the assignment.
	*/
	@Test
	void testCrypt8() {
		String password = "password";
		String salt = "HX";
		String expected = "HX9LLTdc/jiDE";
		String actual = Password.crypt(password, salt);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* The test case is based on the example from the assignment.
	*/
	@Test
	void testCrypt9() {
		String password = "password";
		String salt = "HX";
		String expected = "HX9LLTdc/jiDE";
		String actual = Password.crypt(password, salt);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link Password#crypt(String, String)} method.
	* The test case is based on the example from the assignment.
	*/
	@Test
	void testCrypt10() {
		String password = "password";
		String salt = "HX";
		String expected = "HX9LLTdc/jiDE";
		String actual = Password.crypt(password, salt);
		assertEquals(expected, actual);
	}
}