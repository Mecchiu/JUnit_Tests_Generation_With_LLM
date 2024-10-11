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
    void testCheckDigestWithNullInputs() {
        User user = new User();
        assertFalse(user.checkDigest(null, null));
    }

    @Test
    void testCheckDigestWithEmptyInputs() {
        User user = new User();
        assertFalse(user.checkDigest("", ""));
    }

    @Test
    void testCheckDigestWithDifferentLengthInputs() {
        User user = new User();
        assertFalse(user.checkDigest("abc", "abcd"));
    }

    @Test
    void testCheckDigestWithDifferentInputs() {
        User user = new User();
        assertFalse(user.checkDigest("abc", "def"));
    }

    @Test
    void testCheckDigestWithSameInputs() {
        User user = new User();
        String input = "password";
        String salt = "salt";
        String digest = user.createDigest(salt.getBytes(), input);
        assertTrue(user.checkDigest(digest, input));
    }

    @Test
    void testCheckDigestWithDifferentSalt() {
        User user = new User();
        String input = "password";
        String salt1 = "salt1";
        String salt2 = "salt2";
        String digest = user.createDigest(salt1.getBytes(), input);
        assertFalse(user.checkDigest(digest, input));
        digest = user.createDigest(salt2.getBytes(), input);
        assertFalse(user.checkDigest(digest, input));
    }

    @Test
    void testCheckDigestWithDifferentInput() {
        User user = new User();
        String input1 = "password1";
        String input2 = "password2";
        String salt = "salt";
        String digest = user.createDigest(salt.getBytes(), input1);
        assertFalse(user.checkDigest(digest, input2));
    }

    @Test
    void testCheckDigestWithNullSalt() {
        User user = new User();
        String input = "password";
        String digest = user.createDigest(null, input);
        assertFalse(user.checkDigest(digest, input));
    }

    @Test
    void testCheckDigestWithNullInput() {
        User user = new User();
        String salt = "salt";
        String digest = user.createDigest(salt.getBytes(), null);
        assertFalse(user.checkDigest(digest, null));
    }
}