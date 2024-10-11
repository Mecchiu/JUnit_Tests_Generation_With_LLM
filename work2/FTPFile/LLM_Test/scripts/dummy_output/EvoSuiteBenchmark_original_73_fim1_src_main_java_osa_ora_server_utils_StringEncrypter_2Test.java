package osa.ora.server.utils;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringEncrypter_2Test {

    @Test
    void testDecrypt_NullInput() {
        StringEncrypter encrypter = StringEncrypter.getInstance("testKey");
        assertNull(encrypter.decrypt(null));
    }

    @Test
    void testDecrypt_EmptyInput() {
        StringEncrypter encrypter = StringEncrypter.getInstance("testKey");
        assertEquals("", encrypter.decrypt(""));
    }

    @Test
    void testDecrypt_ValidInput() {
        StringEncrypter encrypter = StringEncrypter.getInstance("testKey");
        String encrypted = encrypter.encrypt("Hello, World!");
        assertEquals("Hello, World!", encrypter.decrypt(encrypted));
    }

    @Test
    void testDecrypt_InvalidInput() {
        StringEncrypter encrypter = StringEncrypter.getInstance("testKey");
        assertNull(encrypter.decrypt("InvalidInput"));
    }

    @Test
    void testDecrypt_LongInput() {
        StringEncrypter encrypter = StringEncrypter.getInstance("testKey");
        String longString = "This is a very long string that will be encrypted and decrypted successfully.";
        String encrypted = encrypter.encrypt(longString);
        assertEquals(longString, encrypter.decrypt(encrypted));
    }

    @Test
    void testDecrypt_SpecialCharactersInput() {
        StringEncrypter encrypter = StringEncrypter.getInstance("testKey");
        String specialChars = "!@#$%^&*()_+";
        String encrypted = encrypter.encrypt(specialChars);
        assertEquals(specialChars, encrypter.decrypt(encrypted));
    }

    @Test
    void testDecrypt_UnicodeInput() {
        StringEncrypter encrypter = StringEncrypter.getInstance("testKey");
        String unicodeString = "こんにちは、世界！";
        String encrypted = encrypter.encrypt(unicodeString);
        assertEquals(unicodeString, encrypter.decrypt(encrypted));
    }

    @Test
    void testDecrypt_RepeatedEncryptionDecryption() {
        StringEncrypter encrypter = StringEncrypter.getInstance("testKey");
        String input = "Test String for repeated encryption and decryption.";
        String encrypted = encrypter.encrypt(input);
        assertEquals(input, encrypter.decrypt(encrypter.decrypt(encrypted)));
    }

    @Test
    void testDecrypt_InvalidKey() {
        StringEncrypter encrypter = StringEncrypter.getInstance("invalidKey");
        assertNull(encrypter.decrypt("TestString"));
    }
}
