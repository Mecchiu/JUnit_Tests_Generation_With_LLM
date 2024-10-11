// StringEncrypter_1Test.java
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
* It contains one unit test case for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypter_1Test {
		private final StringEncrypter instance = new StringEncrypter_1();
	

    /**
     * Test of encrypt method, of StringEncrypter_1.
     */
    @Test
    public void testEncrypt() {
		String encrypted = instance.encrypt("");
		assertEncrypted("", encrypted); 
	}

	/**
	* Test of encrypt with null String.
	*/
	@Test
    public void testEncryptWithNull() {
		String encrypted = StringEncrypter.decrypt(null);
		assertEncrypted("", encrypted);   
    }

			/**
	* Test of encrypt with empty String.
	*/
	@Test
    public void testEncryptWithEmpty() {
		String encrypted = instance.encrypt("");
		assertEncrypted("", encrypted);   
    }

			/**
	* Test of encrypt with empty string to be encrypted.
	*/
	@Test
    @FeatureMethod({FeatureDecrypter.class})
    public void testEncryptWithEmptyMessage() {
		String encrypted = StringEncrypter.decrypt("");
		assertEncrypted("", encrypted);   
    }
	
}