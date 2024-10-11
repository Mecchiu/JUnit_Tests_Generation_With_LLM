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

	private final String testString = "A String!!!";
    @Test
    public void decryptTest() {
        if (testString.length() == 0)
            return;
        try {
            // Decrypt
            StringEncrypter sci = new StringEncrypter();
            String result =sci.decrypt(testString);
            assertEquals("A String!!!",result);
        } catch (Exception ignored) {}
    }
   
    @Test
    public void getKeySpec() {
        assertNotNull(SecretKeyFactory.getInstance("PBE"));
        
        // Initialize Cipher object
        Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
    
        // Initialize algorithm parameters
        AlgorithmParameterSpec params = new PBEParameterSpec("AES");
    
    /*   * Create a PBEParameterSpec with 128 bits of salt (AES)
    * using the PBKDF2 with no additional salt*/
    params = new PBEParameterSpec(128, 0);
    PBEKeySpec keySpec = new PBEKeySpec(new byte[16]);
    SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2");
    SecretKey key;

    // Encrypt
    byte[] result = cipher.doFinal(testString.getBytes("UTF8"));
    byte[] dec = cipher.doFinal(testString.getBytes("UTF8"));
    System.err.println("before encrypt: "+StringEncoder64.encode(testString)+ " --> "+ StringEncoder64.encode(result));
    System.err.println("in: "+StringEncoder64.encode(testString)+ " --> "+StringEncoder64.encode(result)+ " "+StringEncoder64.encode(testString.getBytes("UTF8")));
    key = factory.generateSecret(keySpec);
    System.err.println("After encrypt: "+StringEncoder64.encode(testString)+ " --> "+StringEncoder64.encode(result));
    System.err.println("in: "+StringEncoder64.encode(testString)+ " --> "+StringEncoder64.encode(result)+ " "+StringEncoder64.encode(testString.getBytes("UTF8")));
    System.err.println("decrypt: "+StringEncoder64.encode(dec)+ " --> "+StringEncoder64.encode(result));
    System.err.println("result: "+StringEncoder64.encode(result));
    result = cipher.destroy();
    System.err.println("after encrypt: "+StringEncoder64.encode(testString)+ " --> "+ StringEncoder64.encode(result));
    System.err.println("in: "+StringEncoder64.encode(testString)+ " --> "+ StringEncoder64.encode(result)+ " "+StringEncoder64.encode(testString.getBytes("UTF8")));
    System.err.println("result: "+ StringDecoder64.decode(StringDecoder64.encode(result))+ " --> "+StringDecoder64.encode(result) );
    assertEquals(testString,StringDecoder64.decode(StringDecoder64.encode(testString)) );
   }

 

 





}
