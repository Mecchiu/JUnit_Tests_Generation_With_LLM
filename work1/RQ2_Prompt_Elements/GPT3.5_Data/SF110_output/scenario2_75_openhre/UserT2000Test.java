// UserTest.java
package com.browsersoft.aacs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link User}.
 * It contains ten unit test cases for the {@link User#checkDigest(String, String)} method.
 */
class UserTest {

    @Test
    void testCheckDigestWithMatchingDigestAndIdentity() {
        User user = new User();
        String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
        String identity = "password";
        assertTrue(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithNonMatchingDigestAndIdentity() {
        User user = new User();
        String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
        String identity = "wrongpassword";
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithSHA1Digest() {
        User user = new User();
        String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
        String identity = "password";
        assertTrue(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithSSHA1Digest() {
        User user = new User();
        String digest = "{SSHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
        String identity = "password";
        assertTrue(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithEmptyDigest() {
        User user = new User();
        String digest = "";
        String identity = "password";
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithEmptyIdentity() {
        User user = new User();
        String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
        String identity = "";
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithNullDigest() {
        User user = new User();
        String digest = null;
        String identity = "password";
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithNullIdentity() {
        User user = new User();
        String digest = "{SHA}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
        String identity = null;
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithInvalidDigestFormat() {
        User user = new User();
        String digest = "W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
        String identity = "password";
        assertFalse(user.checkDigest(digest, identity));
    }

    @Test
    void testCheckDigestWithInvalidDigestAlgorithm() {
        User user = new User();
        String digest = "{MD5}W6ph5Mm5Pz8GgiULbPgzG37mj9g=";
        String identity = "password";
        assertFalse(user.checkDigest(digest, identity));
    }
}