import static org.junit.jupiter.api.Assertions.assertEquals;

class EncryptTest {

    @Test
    void testEncryptEmptyString() {
        String s = "";
        String expected = "";
        String actual = Encrypt.encrypt(s);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptLowerCase() {
        String s = "hello";
        String expected = "jgnnq";
        String actual = Encrypt.encrypt(s);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptUpperCase() {
        String s = "WORLD";
        String expected = "YQTNF";
        String actual = Encrypt.encrypt(s);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptMixedCase() {
        String s = "HeLLo";
        String expected = "JgNnq";
        String actual = Encrypt.encrypt(s);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptNonAlphabetic() {
        String s = "123";
        String expected = "123";
        String actual = Encrypt.encrypt(s);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptWithSpaces() {
        String s = "hello world";
        String expected = "jgnnq yqtnf";
        String actual = Encrypt.encrypt(s);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptWithPunctuation() {
        String s = "hello, world!";
        String expected = "jgnnq, yqtnf!";
        String actual = Encrypt.encrypt(s);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptWithSpecialCharacters() {
        String s = "hello@world#";
        String expected = "jgnnq@yqtnf#";
        String actual = Encrypt.encrypt(s);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptWithUnicodeCharacters() {
        String s = "こんにちは";
        String expected = "さようなら";
        String actual = Encrypt.encrypt(s);
        assertEquals(expected, actual);
    }

    @Test
    void testEncryptWithLongString() {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String expected = "cdefghijklmnopqrstuvwxyzabCDEFGHIJKLMNOPQRSTUVWXYZAB";
        String actual = Encrypt.encrypt(s);
        assertEquals(expected, actual);
    }
}