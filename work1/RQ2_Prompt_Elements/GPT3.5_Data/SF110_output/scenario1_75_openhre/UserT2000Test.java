// UserTest.java
package com.browsersoft.aacs;

import org.apache.xerces.impl.dv.util.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link User}.
 * It contains ten unit test cases for the {@link User#checkDigest(String, String)} method.
 */
class UserTest {

    @Test
    void testCheckDigestWithValidDigest() {
        User user = new User();
        String identity = "testuser";
        String salt = "testsalt";
        String password = "testpassword";
        String digest = "{SHA}" + Base64.encode(sha1(password + salt));
        assertTrue(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithInvalidDigest() {
        User user = new User();
        String identity = "testuser";
        String salt = "testsalt";
        String password = "testpassword";
        String digest = "{SHA}" + Base64.encode(sha1(password + salt));
        assertFalse(user.checkDigest(digest + "invalid", identity));
    }

    @Test
    void testCheckDigestWithInvalidIdentity() {
        User user = new User();
        String identity = "testuser";
        String salt = "testsalt";
        String password = "testpassword";
        String digest = "{SHA}" + Base64.encode(sha1(password + salt));
        assertFalse(user.checkDigest(digest, "invaliduser"));
    }

    @Test
    void testCheckDigestWithEmptyIdentity() {
        User user = new User();
        String identity = "";
        String salt = "testsalt";
        String password = "testpassword";
        String digest = "{SHA}" + Base64.encode(sha1(password + salt));
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithEmptyDigest() {
        User user = new User();
        String identity = "testuser";
        String digest = "";
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithNullIdentity() {
        User user = new User();
        String identity = null;
        String salt = "testsalt";
        String password = "testpassword";
        String digest = "{SHA}" + Base64.encode(sha1(password + salt));
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithNullDigest() {
        User user = new User();
        String identity = "testuser";
        String digest = null;
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithSSHA() {
        User user = new User();
        String identity = "testuser";
        String salt = "testsalt";
        String password = "testpassword";
        String digest = "{SSHA}" + Base64.encode(sha1(password + salt) + salt.getBytes());
        assertTrue(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithInvalidSSHA() {
        User user = new User();
        String identity = "testuser";
        String salt = "testsalt";
        String password = "testpassword";
        String digest = "{SSHA}" + Base64.encode(sha1(password + salt) + salt.getBytes());
        assertFalse(user.checkDigest(digest + "invalid", identity));
    }

    @Test
    void testCheckDigestWithInvalidPassword() {
        User user = new User();
        String identity = "testuser";
        String salt = "testsalt";
        String password = "testpassword";
        String digest = "{SHA}" + Base64.encode(sha1("invalidpassword" + salt));
        assertFalse(user.checkDigest(digest, identity));
    }

    private byte[] sha1(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            return md.digest(input.getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}