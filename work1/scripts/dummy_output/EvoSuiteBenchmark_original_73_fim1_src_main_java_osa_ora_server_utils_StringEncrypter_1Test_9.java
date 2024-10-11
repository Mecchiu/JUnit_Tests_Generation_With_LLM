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
    public void testCorrectlyCipherAlgorithm() throws Exception {
		
		final String value = "This is the value of the value";
		
		AlgorithmParameterSpec params = null;
		
		String cipher_string = decrypt(value);
		assertEquals(Algorithms.RSA_v1(), cipher_string);
		params = new PBEParameterSpec("A".toCharArray(), null);
		String pb_encrpt_string = decrypt(value, params);
		assertEquals(Algorithms.RSA_v1(), pb_encrpt_string);
		
		try {
		Cipher cipher = Cipher.getInstance(Algorithms.AES_v12_NS, "BC");
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec("A".toCharArray(), "A".toCharArray()));
	
		// Check for no exception
		cipher_string = decrypt(value, params);
		assertEquals(Algorithms.AES_v12_NS_v1(), cipher_string);
		} catch (Exception e) {
		System.out.println("Encounter error:");
		e.printStackTrace();
		fail("Unable to create Cipher with appropriate algorithms");
		}
	}
	
	
	@Test
    public void testCipherParameters() throws Exception {
		// Test required if the cipher parameter algorithm is AES-V1
		
		// Test required if AES has "AES-ECB/OFB" cipher parameter specification
		
		AlgorithmParameterSpec params = null;
		// String[] key_size_strings = { "16", "32", "48", "64", "128", "256" };
		String[] key_size_strings = new String[] {};
		
		for (String s : key_size_strings) {
			params = new PBEParameterSpec("A".toCharArray(), s);
			String pb_encrpt_string = encrypt(value, params);
			AlgorithmParameterSpec pb_params = null;
			try {
				String cipher_string = decrypt(value, params);
				cipher_string = pb_encrpt_string;
			} catch (Exception e) {
				e.printStackTrace();
				fail("Encounter error: "+s);
			}
			assertEquals(Algorithms.AES_v1(), cipher_string);
			if(s.toLowerCase().equals(Algorithms.AES_v1())) {
				assertNull(pb_params);
			} else {
				assertNotNull(pb_params);
				pb_params = cipher_string.substring(0, 8) + "." + cipher_string.substring(8, 12);
				assertEquals(pb_params.getParameterSpec() instanceof PBEParameterSpec, true);
			}
		}
		
		// Test required if AES has "AES-ECB/OFB" parameter specification
		
		AlgorithmParameterSpec params2 = null;
		String[] value_size_strings = { "16", "32", "48", "64", "128", "256" };
		for (String s : value_size_strings) {
			
			params2 = new PBEParameterSpec("A".toCharArray(), s);
			String pb_encrpt_string = encrypt(value, params2);
			
			AlgorithmParameterSpec pb_params = null;
			try {
				String cipher_string = decrypt(value, params);
				cipher_string = pb_encrpt_string;
			} catch (Exception e) {
				e.printStackTrace();
				fail("Encounter error: "+s);
			}
			assertEquals(Algorithms.AES_v1(), cipher_string);
			if(s.toLowerCase().equals(Algorithms.AES_v1())) {
				assertNull(pb_params);
			} else {
				assertNotNull(pb_params);
				pb_params = cipher_string.substring(0, 8) + "." + cipher_string.substring(8, 12);
				assertEquals(pb_params, encrypt(value, params2));
			}
			
		}
	}
	
	private String decrypt(String value, AlgorithmParameterSpec params) throws Exception {
		String cipher = null;
		Cipher cipher_cipher = Cipher.getInstance(Algorithms.AES_v1(), "BC");
		int offset = cipher_cipher.getBlockSize();
		try {
			// Encrypt encrypted values
    		cipher = cipher_cipher.doFinal(value.getBytes());
    		// Decrypt encrypted values
    		value = new String(cipher, "UTF-8");
		} catch (Exception e) {
			System.out.println("Decryption error");
			e.printStackTrace();
			fail("Unable to create Cipher with appropriate parameters");
			}
		return value;	
	}
	
	private String encrypt(String value) throws Exception {
		Cipher cipher = Cipher.getInstance(Algorithms.AES_v1(), "BC");
		int offset = cipher.getBlockSize();
		try {
			cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(value.getBytes(), "A".toCharArray()));
			return new String(cipher.doFinal());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("Encounter error: "+value);
		}
		return value;	
	}
}