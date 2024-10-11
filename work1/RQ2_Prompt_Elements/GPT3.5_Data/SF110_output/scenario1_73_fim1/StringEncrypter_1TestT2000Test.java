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

    private Cipher dcipher;

    public StringEncrypter(SecretKey key, AlgorithmParameterSpec paramSpec) throws Exception {
        dcipher = Cipher.getInstance("PBEWithMD5AndDES/CBC/PKCS5Padding");
        dcipher.init(Cipher.DECRYPT_MODE, key, paramSpec);
    }

    public String decrypt(String str) {
        if (str == null)
            return null;
        try {
            // Decode base64 to get bytes
            byte[] dec = StringEncoder64.decode(str);
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
    void testDecryptNull() {
        StringEncrypter encrypter = new StringEncrypter(null, null);
        assertNull(encrypter.decrypt(null));
    }

    @Test
    void testDecryptEmptyString() {
        StringEncrypter encrypter = new StringEncrypter(null, null);
        assertEquals("", encrypter.decrypt(""));
    }

    @Test
    void testDecryptValidString() throws Exception {
        String password = "password";
        String salt = "salt";
        int iterationCount = 1000;
        int keyLength = 128;
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), iterationCount, keyLength);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(keySpec);
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt.getBytes(), iterationCount);
        StringEncrypter encrypter = new StringEncrypter(key, paramSpec);
        String encryptedString = "U2FsdGVkX1+JQw==";
        assertEquals("test", encrypter.decrypt(encryptedString));
    }

    @Test
    void testDecryptInvalidString() throws Exception {
        String password = "password";
        String salt = "salt";
        int iterationCount = 1000;
        int keyLength = 128;
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), iterationCount, keyLength);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(keySpec);
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt.getBytes(), iterationCount);
        StringEncrypter encrypter = new StringEncrypter(key, paramSpec);
        String encryptedString = "invalid";
        assertNull(encrypter.decrypt(encryptedString));
    }

    @Test
    void testDecryptInvalidKey() throws Exception {
        String password = "password";
        String salt = "salt";
        int iterationCount = 1000;
        int keyLength = 128;
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), iterationCount, keyLength);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(keySpec);
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt.getBytes(), iterationCount);
        StringEncrypter encrypter = new StringEncrypter(key, paramSpec);
        String encryptedString = "U2FsdGVkX1+JQw==";
        StringEncrypter encrypter2 = new StringEncrypter(null, null);
        assertNull(encrypter2.decrypt(encryptedString));
    }

    @Test
    void testDecryptInvalidParamSpec() throws Exception {
        String password = "password";
        String salt = "salt";
        int iterationCount = 1000;
        int keyLength = 128;
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), iterationCount, keyLength);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(keySpec);
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt.getBytes(), iterationCount);
        StringEncrypter encrypter = new StringEncrypter(key, paramSpec);
        String encryptedString = "U2FsdGVkX1+JQw==";
        AlgorithmParameterSpec paramSpec2 = new PBEParameterSpec("invalid".getBytes(), iterationCount);
        StringEncrypter encrypter2 = new StringEncrypter(key, paramSpec2);
        assertNull(encrypter2.decrypt(encryptedString));
    }

    @Test
    void testDecryptInvalidKeySpec() throws Exception {
        String password = "password";
        String salt = "salt";
        int iterationCount = 1000;
        int keyLength = 128;
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), iterationCount, keyLength);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(keySpec);
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt.getBytes(), iterationCount);
        StringEncrypter encrypter = new StringEncrypter(key, paramSpec);
        String encryptedString = "U2FsdGVkX1+JQw==";
        KeySpec keySpec2 = new PBEKeySpec("invalid".toCharArray(), salt.getBytes(), iterationCount, keyLength);
        SecretKeyFactory keyFactory2 = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key2 = keyFactory2.generateSecret(keySpec2);
        AlgorithmParameterSpec paramSpec2 = new PBEParameterSpec(salt.getBytes(), iterationCount);
        StringEncrypter encrypter2 = new StringEncrypter(key2, paramSpec2);
        assertNull(encrypter2.decrypt(encryptedString));
    }

    @Test
    void testDecryptInvalidAlgorithm() throws Exception {
        String password = "password";
        String salt = "salt";
        int iterationCount = 1000;
        int keyLength = 128;
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), iterationCount, keyLength);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(keySpec);
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt.getBytes(), iterationCount);
        StringEncrypter encrypter = new StringEncrypter(key, paramSpec);
        String encryptedString = "U2FsdGVkX1+JQw==";
        StringEncrypter encrypter2 = new StringEncrypter(key, paramSpec, "invalid");
        assertNull(encrypter2.decrypt(encryptedString));
    }

    @Test
    void testDecryptInvalidCipher() throws Exception {
        String password = "password";
        String salt = "salt";
        int iterationCount = 1000;
        int keyLength = 128;
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), iterationCount, keyLength);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(keySpec);
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt.getBytes(), iterationCount);
        StringEncrypter encrypter = new StringEncrypter(key, paramSpec);
        String encryptedString = "U2FsdGVkX1+JQw==";
        Cipher cipher = Cipher.getInstance("invalid");
        StringEncrypter encrypter2 = new StringEncrypter(key, paramSpec, cipher);
        assertNull(encrypter2.decrypt(encryptedString));
    }

    @Test
    void testDecryptInvalidUTF8() throws Exception {
        String password = "password";
        String salt = "salt";
        int iterationCount = 1000;
        int keyLength = 128;
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), iterationCount, keyLength);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(keySpec);
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt.getBytes(), iterationCount);
        StringEncrypter encrypter = new StringEncrypter(key, paramSpec);
        String encryptedString = "U2FsdGVkX1+JQw==";
        byte[] dec = StringEncoder64.decode(encryptedString);
        byte[] utf8 = encrypter.decrypt(dec).getBytes("UTF-16");
        assertNull(new String(utf8, "UTF8"));
    }

    @Test
    void testDecryptInvalid