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
    public void testECrypt() {
    	System.out.println("testECrypt()");
    	StringUtility utility = new StringUtility();
    	try {
    		String str = "test";
            byte[] keyBytes = utility.encrypt(str);
            int[] keyArray = utility.decrypt(keyBytes);
            assertArrayEquals(keyArray, new int[] {2, 3, 4});
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
      int[] decode(String encoded) {
    	int[] result;
    	try {
    		result = new int[8];
    		byte b[] = codec.encode(encoded);
    		byte[] dec = codec.decode(b);
    		System.arraycopy(dec, 0, result, 0, 6);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return result;
       }
}
