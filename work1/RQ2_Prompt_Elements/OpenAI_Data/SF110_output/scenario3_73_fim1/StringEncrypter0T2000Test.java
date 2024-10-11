// StringEncrypterTest.java
package osa.ora.server.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains ten unit test cases for the {@link StringEncrypter#encrypt(String)} method.
*/
class StringEncrypterTest {

	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a String with a length of one.
	*/
	@Test
	public void testEncryptOneChar() {
		StringEncrypter encrypter = new StringEncrypter();
		String encrypted = encrypter.encrypt("a");
		assertEquals("a", encrypted);
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a String with a length of two.
	*/
	@Test
	public void testEncryptTwoChars() {
		StringEncrypter encrypter = new StringEncrypter();
		String encrypted = encrypter.encrypt("ab");
		assertEquals("ab", encrypted);
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a String with a length of three.
	*/
	@Test
	public void testEncryptThreeChars() {
		StringEncrypter encrypter = new StringEncrypter();
		String encrypted = encrypter.encrypt("abc");
		assertEquals("abc", encrypted);
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a String with a length of four.
	*/
	@Test
	public void testEncryptFourChars() {
		StringEncrypter encrypter = new StringEncrypter();
		String encrypted = encrypter.encrypt("abcd");
		assertEquals("abcd", encrypted);
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a String with a length of five.
	*/
	@Test
	public void testEncryptFiveChars() {
		StringEncrypter encrypter = new StringEncrypter();
		String encrypted = encrypter.encrypt("abcde");
		assertEquals("abcde", encrypted);
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a String with a length of six.
	*/
	@Test
	public void testEncryptSixChars() {
		StringEncrypter encrypter = new StringEncrypter();
		String encrypted = encrypter.encrypt("abcdef");
		assertEquals("abcdef", encrypted);
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a String with a length of seven.
	*/
	@Test
	public void testEncryptSevenChars() {
		StringEncrypter encrypter = new StringEncrypter();
		String encrypted = encrypter.encrypt("abcdefg");
		assertEquals("abcdefg", encrypted);
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a String with a length of eight.
	*/
	@Test
	public void testEncryptEightChars() {
		StringEncrypter encrypter = new StringEncrypter();
		String encrypted = encrypter.encrypt("abcdefgh");
		assertEquals("abcdefgh", encrypted);
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a String with a length of nine.
	*/
	@Test
	public void testEncryptNineChars() {
		StringEncrypter encrypter = new StringEncrypter();
		String encrypted = encrypter.encrypt("abcdefghi");
		assertEquals("abcdefghi", encrypted);
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a String with a length of ten.
	*/
	@Test
	public void testEncryptTenChars() {
		StringEncrypter encrypter = new StringEncrypter();
		String encrypted = encrypter.encrypt("abcdefghij");
		assertEquals("abcdefghij", encrypted);
	}
}