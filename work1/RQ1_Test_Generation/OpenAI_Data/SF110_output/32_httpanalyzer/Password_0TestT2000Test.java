// Password_0Test.java
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
class Password_0Test {

	/**
	* Test case for {@link Password#crypt(String, String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>password: "password"</li>
	* <li>salt: "salt"</li>
	* </ul>
	* The expected result is "salt/..password".
	*/
	@Test
	void testCrypt_0() {
		String password = "password";
		String salt = "salt";
		String result = Password.crypt(password, salt);
		assertEquals("salt/..password", result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>password: "password"</li>
	* <li>salt: "salt"</li>
	* </ul>
	* The expected result is "salt/..password".
	*/
	@Test
	void testCrypt_1() {
		String password = "password";
		String salt = "salt";
		String result = Password.crypt(password, salt);
		assertEquals("salt/..password", result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>password: "password"</li>
	* <li>salt: "salt"</li>
	* </ul>
	* The expected result is "salt/..password".
	*/
	@Test
	void testCrypt_2() {
		String password = "password";
		String salt = "salt";
		String result = Password.crypt(password, salt);
		assertEquals("salt/..password", result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>password: "password"</li>
	* <li>salt: "salt"</li>
	* </ul>
	* The expected result is "salt/..password".
	*/
	@Test
	void testCrypt_3() {
		String password = "password";
		String salt = "salt";
		String result = Password.crypt(password, salt);
		assertEquals("salt/..password", result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>password: "password"</li>
	* <li>salt: "salt"</li>
	* </ul>
	* The expected result is "salt/..password".
	*/
	@Test
	void testCrypt_4() {
		String password = "password";
		String salt = "salt";
		String result = Password.crypt(password, salt);
		assertEquals("salt/..password", result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>password: "password"</li>
	* <li>salt: "salt"</li>
	* </ul>
	* The expected result is "salt/..password".
	*/
	@Test
	void testCrypt_5() {
		String password = "password";
		String salt = "salt";
		String result = Password.crypt(password, salt);
		assertEquals("salt/..password", result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>password: "password"</li>
	* <li>salt: "salt"</li>
	* </ul>
	* The expected result is "salt/..password".
	*/
	@Test
	void testCrypt_6() {
		String password = "password";
		String salt = "salt";
		String result = Password.crypt(password, salt);
		assertEquals("salt/..password", result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>password: "password"</li>
	* <li>salt: "salt"</li>
	* </ul>
	* The expected result is "salt/..password".
	*/
	@Test
	void testCrypt_7() {
		String password = "password";
		String salt = "salt";
		String result = Password.crypt(password, salt);
		assertEquals("salt/..password", result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>password: "password"</li>
	* <li>salt: "salt"</li>
	* </ul>
	* The expected result is "salt/..password".
	*/
	@Test
	void testCrypt_8() {
		String password = "password";
		String salt = "salt";
		String result = Password.crypt(password, salt);
		assertEquals("salt/..password", result);
	}
	
	/**
	* Test case for {@link Password#crypt(String, String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>password: "password"</li>
	* <li>salt: "salt"</li>
	* </ul>
	* The expected result is "salt/..password".
	*/
	@Test
	void testCrypt_9() {
		String password = "password";
		String salt = "salt";
		String result = Password.crypt(password, salt);
		assertEquals("salt/..password", result);
	}
	
}

// Password_1Test.java
package httpanalyzer;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Password}.
* It contains ten unit test cases for the {@link Password#hashMD5(String)} method.
*/
class Password_1Test {
		
	/**
	* Test case for {@link Password#hashMD5(String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>baseString: "password"</li>
	* </ul>
	* The expected result is "5f4dcc3b5aa765d61d8327deb882cf99".
	*/
	@Test
	void testHashMD5_0() {
		String baseString = "password";
		String result = Password.hashMD5(baseString);
		assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", result);
	}
	
	/**
	* Test case for {@link Password#hashMD5(String)}.
	* It tests the method with the following parameters:
	* <ul>
	* <li>baseString: "password"</li>
	* </ul>
	* The expected result is "5f4dcc3b5aa765d61d8327deb882cf99".
	*/
	@Test
	void testHashMD5_1() {
		String baseString