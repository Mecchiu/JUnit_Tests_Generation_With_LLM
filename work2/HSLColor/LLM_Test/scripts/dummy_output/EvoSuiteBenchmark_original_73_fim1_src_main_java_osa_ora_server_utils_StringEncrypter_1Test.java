package osa.ora.server.utils;
java
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringEncrypter_1Test {

    @Test
    void testEncrypt_NullInput_ReturnsNull() {
        StringEncrypter encrypter = StringEncrypter.getInstance("test");
        String encrypted = encrypter.encrypt(null);
        assertEquals(null, encrypted);
    }

    @Test
    void testEncrypt_EmptyInput_ReturnsEmpty() {
        StringEncrypter encrypter = StringEncrypter.getInstance("test");
        String encrypted = encrypter.encrypt("");
        assertEquals("", encrypted);
    }

    @Test
    void testEncrypt_ValidInput_ReturnsEncryptedString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("test");
        String encrypted = encrypter.encrypt("Hello, World!");
        assertNotEquals("Hello, World!", encrypted);
    }

    @Test
    void testEncrypt_Decrypt_ReturnsOriginalString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("test");
        String original = "Hello, World!";
        String encrypted = encrypter.encrypt(original);
        String decrypted = encrypter.decrypt(encrypted);
        assertEquals(original, decrypted);
    }

    @Test
    void testEncrypt_SameInput_ReturnsDifferentEncryptedStrings() {
        StringEncrypter encrypter = StringEncrypter.getInstance("test");
        String input = "Hello, World!";
        String encrypted1 = encrypter.encrypt(input);
        String encrypted2 = encrypter.encrypt(input);
        assertNotEquals(encrypted1, encrypted2);
    }

    @Test
    void testEncrypt_LongInput_ReturnsEncryptedString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("test");
        String input = "This is a long input string to test encryption.";
        String encrypted = encrypter.encrypt(input);
        assertNotEquals(input, encrypted);
    }

    @Test
    void testEncrypt_SpecialCharacters_ReturnsEncryptedString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("test");
        String input = "!@#$%^&*()_+";
        String encrypted = encrypter.encrypt(input);
        assertNotEquals(input, encrypted);
    }

    @Test
    void testEncrypt_Numbers_ReturnsEncryptedString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("test");
        String input = "1234567890";
        String encrypted = encrypter.encrypt(input);
        assertNotEquals(input, encrypted);
    }

    @Test
    void testEncrypt_Alphanumeric_ReturnsEncryptedString() {
        StringEncrypter encrypter = StringEncrypter.getInstance("test");
        String input = "abc123XYZ";
        String encrypted = encrypter.encrypt(input);
        assertNotEquals(input, encrypted);
    }
}
