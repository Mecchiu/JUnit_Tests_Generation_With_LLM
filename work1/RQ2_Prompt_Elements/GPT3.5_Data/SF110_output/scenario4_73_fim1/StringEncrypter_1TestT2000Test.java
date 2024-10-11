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
* It contains ten unit test cases for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypter_1Test {
    @Test
    void testDecrypt() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String encrypted = encrypter.encrypt("test");
        String decrypted = encrypter.decrypt(encrypted);
        assertEquals("test", decrypted);
    }

    @Test
    void testDecryptEmptyString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String encrypted = encrypter.encrypt("");
        String decrypted = encrypter.decrypt(encrypted);
        assertEquals("", decrypted);
    }

    @Test
    void testDecryptNullString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String decrypted = encrypter.decrypt(null);
        assertNull(decrypted);
    }

    @Test
    void testDecryptInvalidString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String decrypted = encrypter.decrypt("invalid");
        assertNull(decrypted);
    }

    @Test
    void testDecryptLongString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("FIM");
        String longString = "This is a very long string that is used for testing purposes. It should be long enough to test the limits of the encryption algorithm.";
        String encrypted = encrypter.encrypt(longString);
        String decrypted = encrypter.decrypt(encrypted);
        assertEquals(longString, decrypted);
    }

    @Test
    void testDecryptDifferentInstance() {
        StringEncrypter encrypter1 = StringEncrypter.getInstance("FIM");
        StringEncrypter encrypter2 = StringEncrypter.getInstance("FIM");
        String encrypted = encrypter1.encrypt("test");
        String decrypted = encrypter2.decrypt(encrypted);
        assertEquals("test", decrypted);
    }

    @Test
    void testDecryptDifferentKey() {
        StringEncrypter encrypter1 = StringEncrypter.getInstance("FIM");
        StringEncrypter encrypter2 = StringEncrypter.getInstance("KEY");
        String encrypted = encrypter1.encrypt("test");
        String decrypted = encrypter2.decrypt(encrypted);
        assertNull(decrypted);
    }

    @Test
    void testDecryptSameKeyDifferentAlgorithm() {
        StringEncrypter encrypter1 = StringEncrypter.getInstance("FIM");
        StringEncrypter encrypter2 = StringEncrypter.getInstance("FIM");
        encrypter1.ecipher = null;
        encrypter2.dcipher = null;
        String encrypted = encrypter1.encrypt("test");
        String decrypted = encrypter2.decrypt(encrypted);
        assertNull(decrypted);
    }

    @Test
    void testDecryptDifferentSalt() {
        StringEncrypter encrypter1 = StringEncrypter.getInstance("FIM");
        StringEncrypter encrypter2 = StringEncrypter.getInstance("FIM");
        ((PBEParameterSpec)encrypter1.ecipher.getParameters()).getSalt()[0] = 1;
        String encrypted = encrypter1.encrypt("test");
        String decrypted = encrypter2.decrypt(encrypted);
        assertNull(decrypted);
    }

    @Test
    void testDecryptDifferentIterationCount() {
        StringEncrypter encrypter1 = StringEncrypter.getInstance("FIM");
        StringEncrypter encrypter2 = StringEncrypter.getInstance("FIM");
        ((PBEParameterSpec)encrypter1.ecipher.getParameters()).setIterationCount(20);
        String encrypted = encrypter1.encrypt("test");
        String decrypted = encrypter2.decrypt(encrypted);
        assertNull(decrypted);
    }
}