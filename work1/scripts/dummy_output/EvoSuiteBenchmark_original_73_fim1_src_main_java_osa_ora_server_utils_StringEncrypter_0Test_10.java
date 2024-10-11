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
     * Tests the encryption of an RSA key and using the default algorithm.
     */
    @Test
    void testNoEncryptionOfKey() {
    	SecretKey key = new SecretKeyFactory(keyType, defaultAlgParams).generateSecret("RSA");
    	String encrypted = StringEncrypter.encrypt("Hello");
    	assertNotIsEmpty(encrypted);
    	String decrypted = StringEncrypter.decrypt(encrypted, key);
    	assertIsEmpty(decrypted);
    }
		
    /**
     * Tests the encryption of a PBE key and using the default algorithm
     * encoded by standard PBKDF-256.
     */
    @Test
    void testNoEncryptionOfPBEKey() {
		String sgpaKey = "12";
		PBEKeySpec sgpaKeyPKCS12 = new PBEKeySpec(sgpaKey.toCharArray());
    	SecretKey sgpaKeyTemp = null;
    	try {
	    	sgpaKeyTemp = SecretKeyFactory.getInstance(keyType).generateSecret(sgpaKey);
    	} catch (Exception e) {
	    	System.out.println(e.getMessage());
	    	e.printStackTrace();
	    }
    	
    	KeySpec sgpaKeySpec = new PBEParameterSpec(sgpaKeyPKCS12.getSalt(), sgpaKeyPKCS12.getIterations(), sgpaKeyPKCS12.getG(), sgpaKeyPKCS12.getP());
    	SecretKey sgpaKey = SecretKeyFactory.getInstance(keyType).generateSecret(sgpaKeySpec);
    	
    	Cipher cipher = Cipher.getInstance(keyEncryptAlgorithm);	
    	cipher.init(Cipher.ENCRYPT_MODE, sgpaKey, sgpaKeyTemp);
    	String encrypted = StringEncrypter.encrypt(sgpaKeyTemp.toCharArray());
    	assertNotIsEmpty(encrypted);
    	String decrypted = StringEncrypter.decrypt(encrypted, sgpaKeyTemp).trim();
    	assertDoesNotEndWith(decrypted, "ENCRYPTED:");
		}
		
		
		/**
     * Tests the encryption of a PBE key and using the default algorithm encoded
     * by the PKCS#12 algorithm specified by the key spec.
     */
    @Test
    void testEncryptionOfPBEKeyWithPKCS12() {
		String expectedEncryption = "PKCS12KEY1/1H8SQHW9b+xD8yXRjkE+jP7vC7DyZiF+4Lc7BWXJYb" +
		                            "QeX8F0u+5gO3QfDkqRqjFdUlZT5eLzKWmRqdAqd4L9PQM6vN1B+lK4K3O8kvKPJ1t" +
		                            "F0w0zNpOjI3OykUjU8lEjIi3qrOuqNQjX0hqO09rOIi3XkOjIi3jX8f9xrOJi3k" +
		                            "Ll5f0xrOjLxXoqOi3gNrO4gXf0X0gS0xrOi3gjRxXd0xHdX0gO3gJi1X0kXgXf0X2g" +
		                            "F0w1G2OqRxRgjJi3gXf0xgOqRxG0ZB0JpR1gXf0X3gS0P0Z1rXoH0xP0Z1dS0lP" +
		                            "T0Z1dS0mX0nPz10";
		
		String encryptedPkcs12 = StringEncrypter.encrypt(expectedEncryption.getBytes());
    	assertNotIsEmpty(encryptedPkcs12);
    	String decryptedPkcs12 = StringEncrypter.decrypt(encryptedPkcs12, keyTemp, null);
    	assertDoesNotEndWith(decryptedPkcs12, "PKCS12KEY1/1H8SQHW9b+xD8yXRjkE+jP7vC7DyZiF+4Lc7BWXJYb" +
		                            "QeX8F0u+5gO3QfDkqRqjFdUlZT5eLzKWmRqdAqd4L9PQM6vN1B+lK4K3O8kvKPJ1t" +
		                            "F0w0zNpOjI3OykUjU8lEjIi3qrOjIi3jX8f9xrOJi3k" +
		                            "Ll5f0xrOjLxXoqOi3gNrO4gXf0X0gS0xrOi3gjRxXd0xHdX0gO3gJi1X0kXgXf0X2g" +
		                            "F0w1G2OqRxRgjJi3gXf0xgOqRxG0ZB0JpR1gXf0X3gS0P0Z1rXoH0xP0Z1dS0lP" +
		                            "T0Z1dS0mX0nPz10");
    	assertDoesNotContain(decryptedPkcs12, "PKCS" + keyEncryptAlgorithm.substring(1));
    }
		
    /**
     * Tests the encryption of a PBE key encrypted by the PKCS#5 algorithm specified
     * by the key spec.
     */
    @Test
    void testEncryptionOfPBEKeyWithPKCS5() {
}
}