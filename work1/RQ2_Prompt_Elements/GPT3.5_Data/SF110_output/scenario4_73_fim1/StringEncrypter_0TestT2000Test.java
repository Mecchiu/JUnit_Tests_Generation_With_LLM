// StringEncrypter.java
package osa.ora.server.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;

public class StringEncrypter {

    public char[] keyUsed = "FIM".toCharArray();

    Cipher ecipher;

    Cipher dcipher;

    private static StringEncrypter instance;

    /**
     * Singleton
     */
    public static StringEncrypter getInstance(String initKey) {
        if (instance == null) {
            instance = new StringEncrypter(initKey);
        }
        return instance;
    }

    /**
     * private Constructor used to create this object.  Responsible for setting
     * and initializing this object's encrypter and decrypter Chipher instances
     * given a Pass Phrase and algorithm.
     * @param passPhrase Pass Phrase used to initialize both the encrypter and
     *                   decrypter instances.
     */
    private StringEncrypter(String initKey) {
        try {
            // 8-bytes Salt
            byte[] salt = {
                (byte)0xA9, (byte)0x9B, (byte)0xC8, (byte)0x32,
                (byte)0x56, (byte)0x35, (byte)0xE3, (byte)0x03
            };

            // Iteration count
            int iterationCount = 19;

            KeySpec keySpec = new PBEKeySpec(keyUsed, salt, iterationCount);
            SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);

            ecipher = Cipher.getInstance(key.getAlgorithm());
            dcipher = Cipher.getInstance(key.getAlgorithm());

            // Prepare the parameter to the ciphers
            AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);

            // Create the ciphers
            ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
            dcipher.init(Cipher.DECRYPT_MODE, key, paramSpec);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Takes a single String as an argument and returns an Encrypted version
     * of that String.
     * @param str String to be encrypted
     * @return <code>String</code> Encrypted version of the provided String
     */
    public String encrypt(String str) {
        try {
            // Encode the string into bytes using utf-8
            byte[] utf8 = str.getBytes("UTF8");

            // Encrypt
            byte[] enc = ecipher.doFinal(utf8);

            // Encode bytes to base64 to get a string
            return new sun.misc.BASE64Encoder().encode(enc);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Takes a encrypted String as an argument, decrypts and returns the
     * decrypted String.
     * @param str Encrypted String to be decrypted
     * @return <code>String</code> Decrypted version of the provided String
     */
    public String decrypt(String str) {
        try {
            // Decode base64 to get bytes
            byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);

            // Decrypt
            byte[] utf8 = dcipher.doFinal(dec);

            // Decode using utf-8
            return new String(utf8, "UTF8");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

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
    @Test
    void testEncrypt() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String originalString = "This is a test string";
        String encryptedString = encrypter.encrypt(originalString);
        assertNotEquals(originalString, encryptedString);
    }

    @Test
    void testEncryptEmptyString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String originalString = "";
        String encryptedString = encrypter.encrypt(originalString);
        assertNotEquals(originalString, encryptedString);
    }

    @Test
    void testEncryptNullString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String originalString = null;
        String encryptedString = encrypter.encrypt(originalString);
        assertNull(encryptedString);
    }

    @Test
    void testEncryptLongString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String originalString = "This is a very long test string that should be encrypted properly";
        String encryptedString = encrypter.encrypt(originalString);
        assertNotEquals(originalString, encryptedString);
    }

    @Test
    void testEncryptSameString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String originalString = "This is a test string";
        String encryptedString1 = encrypter.encrypt(originalString);
        String encryptedString2 = encrypter.encrypt(originalString);
        assertNotEquals(originalString, encryptedString1);
        assertNotEquals(originalString, encryptedString2);
        assertNotEquals(encryptedString1, encryptedString2);
    }

    @Test
    void testEncryptDifferentKeys() {
        StringEncrypter encrypter1 = StringEncrypter.getInstance("FIM");
        StringEncrypter encrypter2 = StringEncrypter.getInstance("KEY");
        String originalString = "This is a test string";
        String encryptedString1 = encrypter1.encrypt(originalString);
        String encryptedString2 = encrypter2.encrypt(originalString);
        assertNotEquals(originalString, encryptedString1);
        assertNotEquals(originalString, encryptedString2);
        assertNotEquals(encryptedString1, encryptedString2);
    }

    @Test
    void testEncryptSpecialCharacters() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String originalString = "This is a test string with special characters: !@#$%^&*()_+";
        String encryptedString = encrypter.encrypt(originalString);
        assertNotEquals(originalString, encryptedString);
    }

    @Test
    void testEncryptNumbers() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String originalString = "This is a test string with numbers: 1234567890";
        String encryptedString = encrypter.encrypt(originalString);
        assertNotEquals(originalString, encryptedString);
    }

    @Test
    void testEncryptUnicode() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String originalString = "This is a test string with unicode characters: \u00E9\u00E0\u00E8\u00EC\u00F2\u00F9";
        String encryptedString = encrypter.encrypt(originalString);
        assertNotEquals(originalString, encryptedString);
    }

    @Test
    void testEncryptWhitespace() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String originalString = "This is a test string with whitespace characters: \t\n\r\f";
        String encryptedString = encrypter.encrypt(originalString);
        assertNotEquals(originalString, encryptedString);
    }
}