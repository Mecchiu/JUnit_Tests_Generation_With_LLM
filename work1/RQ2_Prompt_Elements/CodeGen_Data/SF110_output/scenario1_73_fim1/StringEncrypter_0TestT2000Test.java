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
// StringEncrypter_0Test.java
    @Test
    void testIn()
		throws Exception {
		SecretKeyFactory kf = SecretKeyFactory.getInstance("PBEWithSHA1AndAES"); 
		SecretKey sKey = (SecretKey)kf.generateSecret("password");
		// KeySpec
        PBEParameterSpec pbeSpec = new PBEParameterSpec(128, 128);
		PBEKeySpec pbeKeySpec=new PBEKeySpec(":", sKey.getEncoded());
            			// AlgorithmParameters
       AlgorithmParameterSpec saltSpec = null;
        PBEKeySpec saltKeySpec = new PBEKeySpec(":".getBytes(CharTableEncoder.UTF8),"password".getBytes(ClientHelloEncoder.UTF8));    
        // KeyFactory
       
        
	    KeyFactory kfTemp = KeyFactory.getInstance("PBEWithSHA1AndAES"); 
		KeySpec ks = kfTemp.generateKeySpec(sKey.getEncoded());
		
		KeySpec hkSpec = null;
		try {
	        
			hkSpec = kfTemp.generateSecret("password".getBytes(ClientHelloEncoder.UTF8));
		}
		catch (Exception e) {
		}
				
		// Cipher 				
	Cipher c = Cipher.getInstance("PASSA3WithSHA1ANDAES"); 

        if (saltSpec!= null)
        	c.init(Cipher.ENCRYPT_MODE, saltKeySpec, saltSpec);
        else
        	c.init(Cipher.ENCRYPT_MODE, pbeKeySpec, pbeSpec);

		String encrypted = encrypt(ClientHelloEncoder.getEncoded(":"));
        
        byte[] encryptedArray = 
			encipher(ClientHelloEncoder.getEncoded(":"), encrypt(ClientHelloEncoder.getEncoded(":")), 
											pbeKeySpec, (ProtocolVersion.TLS10_0_ORDINAL), 
											saltKeySpec, saltSpec);
        assertEquals(encrypted, ClientHelloEncoder.getEncoded(":"));
        assertEquals(ClientHelloEncoder.getEncoded(":"), encryptedArray);

    	c.init(Cipher.ENCRYPT_MODE, pbeKeySpec, pbeSpec);
		c.doFinal(encryptedArray);
	    
		encrypted = ClientHelloEncoder.getEncoded(":") + encodeCipher_128(":");
	    assertEquals(encrypted, ClientHelloEncoder.getEncoded(":"));
	    assertEquals(ClientHelloEncoder.getEncoded(":"), encrypt(encrypted));

	    encrypted = encrypt(":");
	   
	    assertEquals(encrypted, ClientHelloEncoder.getEncoded(":"));
	    
	    encoded = ClientHelloEncoder.getEncoded(encrypted);
	  
	    	assertEquals(ClientHelloEncoder.getEncoded(encrypted), encoded);
	    
	    encrypted = ClientHelloEncoder.getEncoded(":");
	 
	    assertEquals(ClientHelloEncoder.getEncoded(":"), encrypted);
			
    }
}
