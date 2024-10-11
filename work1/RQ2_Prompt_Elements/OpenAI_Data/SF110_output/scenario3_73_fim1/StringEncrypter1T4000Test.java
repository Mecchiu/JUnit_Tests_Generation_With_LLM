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
* It contains ten unit test cases for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypterTest {

	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with a null argument.
	*/
	@Test
	public void testDecryptNull() {
		StringEncrypter encrypter = new StringEncrypter();
		assertThrows(NullPointerException.class, () -> encrypter.decrypt(null));
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with an empty argument.
	*/
	@Test
	public void testDecryptEmpty() {
		StringEncrypter encrypter = new StringEncrypter();
		assertThrows(IllegalArgumentException.class, () -> encrypter.decrypt(""));
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with a valid argument.
	*/
	@Test
	public void testDecryptValid() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("Hello World!", encrypter.decrypt("Hello World!"));
	}
}