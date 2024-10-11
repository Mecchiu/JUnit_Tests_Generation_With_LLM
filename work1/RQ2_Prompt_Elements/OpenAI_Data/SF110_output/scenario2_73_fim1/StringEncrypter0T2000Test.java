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
	* It tests the encryption of a null string.
	*/
	@Test
	void testEncryptNullString() {
		StringEncrypter encrypter = new StringEncrypter();
		assertNull(encrypter.encrypt(null));
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of an empty string.
	*/
	@Test
	void testEncryptEmptyString() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("", encrypter.encrypt(""));
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a string with one character.
	*/
	@Test
	void testEncryptStringWithOneCharacter() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("a", encrypter.encrypt("a"));
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a string with two characters.
	*/
	@Test
	void testEncryptStringWithTwoCharacters() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("ab", encrypter.encrypt("ab"));
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a string with three characters.
	*/
	@Test
	void testEncryptStringWithThreeCharacters() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("abc", encrypter.encrypt("abc"));
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a string with four characters.
	*/
	@Test
	void testEncryptStringWithFourCharacters() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("abcd", encrypter.encrypt("abcd"));
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a string with five characters.
	*/
	@Test
	void testEncryptStringWithFiveCharacters() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("abcde", encrypter.encrypt("abcde"));
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a string with six characters.
	*/
	@Test
	void testEncryptStringWithSixCharacters() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("abcdef", encrypter.encrypt("abcdef"));
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a string with seven characters.
	*/
	@Test
	void testEncryptStringWithSevenCharacters() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("abcdefg", encrypter.encrypt("abcdefg"));
	}
	
	/**
	* Test case for {@link StringEncrypter#encrypt(String)} method.
	* It tests the encryption of a string with eight characters.
	*/
	@Test
	void testEncryptStringWithEightCharacters() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("abcdefgh", encrypter.encrypt("abcdefgh"));
	}
}