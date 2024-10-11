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
     * Tests the value of {@code encrypt(String)} method.
     */
    @Test
    public void testEncrypt() {
        StringEncrypter instance = new StringEncrypter();
        String encryptStr = "A password";
        String expectedEncryptedStr = "A passwordAWEYWnU";
        String encryptedStr = instance.encrypt(encryptStr);
        assertEquals(expectedEncryptedStr, encryptedStr);
        String pass = "A password"; // Required to encrypt the given password
        encryptStr = pass;
    }
    
    /**
     * Tests the value of {@code encrypt()} method for plain text
     * password strings.
     */
    @Test
    public void testEncryptChar() {
        StringEncrypter instance = new StringEncrypter();
        String encryptChar = "A password";
        String encrypted = instance.encrypt(encryptChar);
        assertEquals(":password", encrypted);
        encryptChar = "a password";
        encrypted = instance.encrypt(encryptChar);
        assertEquals(":password", encrypted);
    }
	
	/**
     * Tests the value of {@code encrypt()} method for passwords that 
     * contain non-alphanumeric character.
     */
    @Test
    public void testEnrollCharPassword() {
        StringEncrypter instance = new StringEncrypter();
        String encryptChar = "A password";
        boolean encrypted = instance.encrypt(encryptChar, ":password", "0123456789");
        assertTrue(encrypted);
    }
	
	/**
     * Tests the value of {@code encrypt()} method for passwords that 
     * contain alphanumeric character.
     */
    @Test
    public void testEnrollCharPasswordPlain() {
        StringEncrypter instance = new StringEncrypter();
        String encryptChar = "A password";
        String encrypted = instance.encrypt(encryptChar + ":password");
        assertEquals("A password", encrypted);
    }

    /**
     * Tests calling {@code encrypt()} method with passwords that contain
     * non-alphanumeric character.
     */
    @Test
    public void testEnrollNonAlphanumericPasswd() {
        StringEncrypter instance = new StringEncrypter();
        String encryptChar = "A password";
        boolean encrypted = instance.encrypt(encryptChar, "0123456789");
        assertFalse(encrypted);
    }
	
}