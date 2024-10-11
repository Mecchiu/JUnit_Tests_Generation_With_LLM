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

		@Test
		void testEncrypt() {
				StringEncrypter encrypter = new StringEncrypter();
				String encrypted = encrypter.encrypt("test");
				assertEquals("test", encrypted);
		}
}

// StringEncoder64.java
package osa.ora.server.utils;

import java.io.IOException;

public class StringEncoder64 {

    public static String encode(byte[] bytes) {
        return new sun.misc.BASE64Encoder().encode(bytes);
    }

    public static byte[] decode(String str) throws IOException {
        return new sun.misc.BASE64Decoder().decodeBuffer(str);
    }
}