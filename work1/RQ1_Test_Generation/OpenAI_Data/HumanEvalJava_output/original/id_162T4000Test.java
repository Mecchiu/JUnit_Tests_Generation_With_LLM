// StringToMd5Test.java
package original;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {

	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5() {
		assertEquals("3e25960a79dbc69b674cd4ec67a72c62", StringToMd5.stringToMd5("Hello world"));
		assertEquals("0ef78513b0cb8cef12743f5aeb35f888", StringToMd5.stringToMd5("A B C"));
		assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns null when the given string is empty.
	*/
	@Test
	void testStringToMd5EmptyString() {
		assertNull(StringToMd5.stringToMd5(""));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5WithSpecialCharacters() {
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("!@#$%^&*()_+"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("!@#$%^&*()_+"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("!@#$%^&*()_+"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5WithNumbers() {
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("1234567890"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("1234567890"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("1234567890"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5WithLowerCaseLetters() {
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("abcdefghijklmnopqrstuvwxyz"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("abcdefghijklmnopqrstuvwxyz"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("abcdefghijklmnopqrstuvwxyz"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5WithUpperCaseLetters() {
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5WithMixedCaseLetters() {
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
	
	/**
	* Test case for {@link StringToMd5#stringToMd5(String)} method.
	* It checks if the method returns the correct md5 hash of the given string.
	*/
	@Test
	void testStringToMd5WithMixedCharacters() {
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("!@#$%^&*()_+1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("!@#$%^&*()_+1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		assertEquals("f8d8f9a9c8e8e9f9f8d8f9a9c8e8e9f9", StringToMd5.stringToMd5("!@#$%^&*()_+1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
}