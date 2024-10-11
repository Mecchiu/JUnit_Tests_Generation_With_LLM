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
* It contains ten unit test cases for the {@link StringEncrypter#encrypt(String)} method.
*/
class StringEncrypter_0Test {
    
    private static final String SECRET_KEY = "mySecretKey";
    private static final String SALT = "mySalt";
    private static final int ITERATION_COUNT = 1000;
    private static final int KEY_LENGTH = 128;
    
    private StringEncrypter stringEncrypter;
    
    @BeforeEach
    void setUp() throws Exception {
        // Create the secret key
        KeySpec keySpec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALT.getBytes(), ITERATION_COUNT, KEY_LENGTH);
        SecretKey secretKey = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);
        // Create the parameter spec
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(SALT.getBytes(), ITERATION_COUNT);
        // Create the cipher
        Cipher cipher = Cipher.getInstance(secretKey.getAlgorithm());
        // Initialize the cipher
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, paramSpec);
        // Create the StringEncrypter instance
        stringEncrypter = new StringEncrypter(cipher);
    }
    
    @Test
    void testEncryptNull() {
        assertNull(stringEncrypter.encrypt(null));
    }
    
    @Test
    void testEncryptEmptyString() {
        assertEquals("", stringEncrypter.encrypt(""));
    }
    
    @Test
    void testEncryptSingleCharacter() {
        assertEquals("Kw==", stringEncrypter.encrypt("A"));
    }
    
    @Test
    void testEncryptMultipleCharacters() {
        assertEquals("U29tZSBzdHJpbmc=", stringEncrypter.encrypt("Some string"));
    }
    
    @Test
    void testEncryptSpecialCharacters() {
        assertEquals("J+KAlA==", stringEncrypter.encrypt("éàç"));
    }
    
    @Test
    void testEncryptLongString() {
        String longString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed euismod, sapien vel bibendum bibendum, velit sapien bibendum sapien, vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel bibendum sapien sapien vel