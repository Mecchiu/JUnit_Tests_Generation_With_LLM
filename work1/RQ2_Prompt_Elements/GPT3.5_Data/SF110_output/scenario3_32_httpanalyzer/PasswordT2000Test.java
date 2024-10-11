// Password.java
package httpanalyzer;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class provides methods to encrypt passwords using a salt.
 * The encryption algorithm used is SHA-256.
 */
public class Password {

    /**
     * Returns a String containing the encrypted password.
     *
     * @param password A String containing the unencrypted password.
     * @param salt A 2 character String, containing the salt to encrypt the password with.
     * @return String containing encrypted password.
     */
    public static String encrypt(String password, String salt) {
        String encryptedPassword = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(salt.getBytes());
            byte[] bytes = messageDigest.digest(password.getBytes());
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : bytes) {
                stringBuilder.append(String.format("%02x", b));
            }
            encryptedPassword = stringBuilder.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Password.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encryptedPassword;
    }
}

// PasswordTest.java
package httpanalyzer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Password}.
 * It contains ten unit test cases for the {@link Password#encrypt(String, String)} method.
 */
class PasswordTest {

    @Test
    void testEncryptWithEmptyPasswordAndSalt() {
        String encryptedPassword = Password.encrypt("", "");
        assertEquals("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", encryptedPassword);
    }

    @Test
    void testEncryptWithEmptyPassword() {
        String encryptedPassword = Password.encrypt("", "ab");
        assertEquals("f7c3bc1d808e04732adf679965ccc34ca7ae3441c7536a0933f1d47a8acaa5e2", encryptedPassword);
    }

    @Test
    void testEncryptWithEmptySalt() {
        String encryptedPassword = Password.encrypt("password", "");
        assertEquals("5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8", encryptedPassword);
    }

    @Test
    void testEncryptWithNullPasswordAndSalt() {
        String encryptedPassword = Password.encrypt(null, null);
        assertNull(encryptedPassword);
    }

    @Test
    void testEncryptWithNullPassword() {
        String encryptedPassword = Password.encrypt(null, "ab");
        assertNull(encryptedPassword);
    }

    @Test
    void testEncryptWithNullSalt() {
        String encryptedPassword = Password.encrypt("password", null);
        assertNull(encryptedPassword);
    }

    @Test
    void testEncryptWithShortSalt() {
        String encryptedPassword = Password.encrypt("password", "a");
        assertNull(encryptedPassword);
    }

    @Test
    void testEncryptWithLongSalt() {
        String encryptedPassword = Password.encrypt("password", "abc");
        assertNull(encryptedPassword);
    }

    @Test
    void testEncryptWithValidPasswordAndSalt() {
        String encryptedPassword = Password.encrypt("password", "ab");
        assertEquals("f7c3bc1d808e04732adf679965ccc34ca7ae3441c7536a0933f1d47a8acaa5e2", encryptedPassword);
    }

    @Test
    void testEncryptWithDifferentSalt() {
        String encryptedPassword1 = Password.encrypt("password", "ab");
        String encryptedPassword2 = Password.encrypt("password", "cd");
        assertNotEquals(encryptedPassword1, encryptedPassword2);
    }
}