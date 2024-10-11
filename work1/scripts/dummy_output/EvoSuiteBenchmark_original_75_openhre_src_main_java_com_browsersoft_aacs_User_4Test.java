package com.browsersoft.aacs;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class User_4Test {

    @Test
    void testCheckDigest_ValidDigestAndIdentity_ReturnsTrue() {
        User user = new User();
        String digest = "{SHA}hashedPassword";
        String identity = "password";
        assertTrue(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigest_InvalidDigestAndIdentity_ReturnsFalse() {
        User user = new User();
        String digest = "{SHA}invalidHash";
        String identity = "password";
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigest_NullDigest_ReturnsFalse() {
        User user = new User();
        String identity = "password";
        assertFalse(user.checkDigest(null, identity));
    }

    @Test
    void testCheckDigest_NullIdentity_ReturnsFalse() {
        User user = new User();
        String digest = "{SHA}hashedPassword";
        assertFalse(user.checkDigest(digest, null));
    }

    @Test
    void testCheckDigest_EmptyDigest_ReturnsFalse() {
        User user = new User();
        String digest = "";
        String identity = "password";
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigest_EmptyIdentity_ReturnsFalse() {
        User user = new User();
        String digest = "{SHA}hashedPassword";
        String identity = "";
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigest_ValidSSHA_ReturnsTrue() {
        User user = new User();
        String digest = "{SSHA}hashedPassword";
        String identity = "password";
        assertTrue(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigest_InvalidSSHA_ReturnsFalse() {
        User user = new User();
        String digest = "{SSHA}invalidHash";
        String identity = "password";
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigest_ValidSHA_ReturnsTrue() {
        User user = new User();
        String digest = "{SHA}hashedPassword";
        String identity = "password";
        assertTrue(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigest_InvalidSHA_ReturnsFalse() {
        User user = new User();
        String digest = "{SHA}invalidHash";
        String identity = "password";
        assertFalse(user.checkDigest(digest, identity));
    }
}
