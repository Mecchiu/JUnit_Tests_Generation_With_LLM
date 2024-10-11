// PasswordTest.java
package httpanalyzer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Password}.
 * It contains ten unit test cases for the {@link Password#crypt(String, String)} method.
 */
class PasswordTest {

    @Test
    void testCrypt() {
        String password = "password";
        String salt = "ab";
        String expected = "abzKJQwJqZyE2";
        String actual = Password.crypt(password, salt);
        assertEquals(expected, actual);
    }

    @Test
    void testCryptEmptyPassword() {
        String password = "";
        String salt = "ab";
        String expected = "abzKJQwJqZyE2";
        String actual = Password.crypt(password, salt);
        assertEquals(expected, actual);
    }

    @Test
    void testCryptEmptySalt() {
        String password = "password";
        String salt = "";
        String expected = "zKJQwJqZyE2rk";
        String actual = Password.crypt(password, salt);
        assertEquals(expected, actual);
    }

    @Test
    void testCryptNullPassword() {
        String password = null;
        String salt = "ab";
        assertThrows(NullPointerException.class, () -> {
            Password.crypt(password, salt);
        });
    }

    @Test
    void testCryptNullSalt() {
        String password = "password";
        String salt = null;
        assertThrows(NullPointerException.class, () -> {
            Password.crypt(password, salt);
        });
    }

    @Test
    void testCryptInvalidSalt() {
        String password = "password";
        String salt = "abc";
        assertThrows(IllegalArgumentException.class, () -> {
            Password.crypt(password, salt);
        });
    }

    @Test
    void testCryptInvalidSalt2() {
        String password = "password";
        String salt = "a";
        assertThrows(IllegalArgumentException.class, () -> {
            Password.crypt(password, salt);
        });
    }

    @Test
    void testCryptInvalidSalt3() {
        String password = "password";
        String salt = "abcde";
        assertThrows(IllegalArgumentException.class, () -> {
            Password.crypt(password, salt);
        });
    }

    @Test
    void testCryptInvalidSalt4() {
        String password = "password";
        String salt = "a1";
        assertThrows(IllegalArgumentException.class, () -> {
            Password.crypt(password, salt);
        });
    }

    @Test
    void testCryptInvalidSalt5() {
        String password = "password";
        String salt = "a!";
        assertThrows(IllegalArgumentException.class, () -> {
            Password.crypt(password, salt);
        });
    }
}