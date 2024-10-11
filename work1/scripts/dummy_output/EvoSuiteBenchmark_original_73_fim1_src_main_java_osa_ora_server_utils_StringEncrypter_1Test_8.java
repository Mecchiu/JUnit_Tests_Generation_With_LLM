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
		@Test
		public void encryptedStringsEqual() {
			assertEquals(StringEncrypter.decrypt("AEC"),
					StringEncrypter.decrypt("AEC"));
		}

		@Test
		public void encryptedStringsNotEqual() {
			assertNotEquals(StringEncrypter.decrypt("AED"),
					StringEncrypter.decrypt("AED"));
		}
}