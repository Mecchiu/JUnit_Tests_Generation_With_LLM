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
		
        final static String ENCRYPTED_STRING = "This string is in plain encoding";

	@Test
    public void testDecrypt() {
        StringEncrypter instance = new StringEncrypter();

		assertEquals(
				"Decryption with invalid cipher must be wrong. ENCRYPTED_STRING",
				ENCRYPTED_STRING,
				instance.decrypt(ENCRYPTED_STRING)
				);
    }

}

// Cipher.java