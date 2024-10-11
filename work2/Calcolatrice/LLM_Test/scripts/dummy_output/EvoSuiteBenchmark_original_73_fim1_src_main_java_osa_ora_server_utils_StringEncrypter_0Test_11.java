// StringEncrypter_0Test.java
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
* It contains one unit test case for the {@link StringEncrypter#encrypt(String)} method.
*/
class StringEncrypter_0Test {
		
	/**
	* Test cases for {@link StringEncrypter#encrypt(String)}.
	*/
   @Test
	public void testEncrypterEncrypted(){		
		// Test String
		assertNotNull(encrypt(""));
		assertEquals(String.valueOf(""), encrypt(""));
		
		// Basic String Encrypted
		assertEquals(String.valueOf(""), encrypt("Hello World!"));
		assertEquals(String.valueOf("h"), encrypt("Hello World!"));
	
	}
		
	/**
	* Test cases for {@link StringEncrypter#encrypt(String, String)}.
	*/
   @Test
	public void testEncrypterEncryptedWithSecret(){		
		// Basic String Encrypted
		assertEquals(String.valueOf("Hello World!"), encrypt("Hello World!", "password"));
		assertEquals(String.valueOf("Hello World!"), encrypt("Hello World!", "different secret"));
		assertEquals(String.valueOf("Hello World!"), encrypt("Hello World!", "password"));
		
	}

}

//StringEncrypter_0Test_source.java