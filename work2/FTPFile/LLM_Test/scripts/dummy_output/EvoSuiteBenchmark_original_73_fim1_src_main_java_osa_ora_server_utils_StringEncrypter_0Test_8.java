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
	* Test of encrypt method, of class {@link StringEncrypter}
	*/    
	@Test
    public void testEncrypt(){
        System.out.println("Testing Encrypt"); 
        String str = "This is a test...";
		try {
            assertNull(System.getenv("GTEK"));
            Cipher testCipher = Cipher.getInstance("PTBCP");
            SecretKey key = SecretKeyFactory
            			.getInstance("PBKDF2WithHmacSHA1")
                    	.generateSecret(256);
			testCipher.init(Cipher.ENCRYPT_MODE, key);
        	assertSame(PBECipher.Encrypt, testCipher.getUnderlyingCipher());
        	
        	// Test 1: Test Cipher is encrypted and returned plaintext
        	assertEquals("This is a test " + str + " to be encrypted", 
        			testCipher.doEncrypt(str.getBytes()), new String(testCipher.doFinal(str.getBytes(),
        					str.length())));
	
        	// Test 2: Test PasswordIsDefined
        	assertTrue(testCipher.getUnderlyingCipher().getParameters()!= null);
        	assertTrue(testCipher.getUnderlyingCipher().toString().toLowerCase() 
        			.equals("pbepbcdcpgjkldcphicpjkghmjklpgjckfh")));
        } catch (Exception e) {
			assertEquals("Failed to get Environment to encrypt.\nEnv: GTEK\nReason: ", 1, e.getMessage().length());
		} 
        System.out.println("Finished Testing Encrypt"); 
    }	
}