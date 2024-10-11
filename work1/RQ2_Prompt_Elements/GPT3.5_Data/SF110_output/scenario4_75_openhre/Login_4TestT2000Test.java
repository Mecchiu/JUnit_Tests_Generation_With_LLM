// Login_4Test.java
package com.browsersoft.aacs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Login}.
 * It contains ten unit test cases for the {@link Login#authenticate()} method.
 */
class Login_4Test {

    /**
     * Test case for successful authentication with valid credentials.
     */
    @Test
    void testAuthenticateSuccess() {
        Login login = new Login();
        login.setUsername("testuser");
        login.setPassword("testpass");
        login.setIpAddr("127.0.0.1");
        try {
            User user = login.authenticate();
            assertNotNull(user);
            assertEquals("testuser", user.getUserId());
        } catch (LoginException e) {
            fail("Authentication failed: " + e.getMessage());
        }
    }

    /**
     * Test case for authentication failure with invalid credentials.
     */
    @Test
    void testAuthenticateFailure() {
        Login login = new Login();
        login.setUsername("testuser");
        login.setPassword("wrongpass");
        login.setIpAddr("127.0.0.1");
        assertThrows(LoginException.class, () -> {
            login.authenticate();
        });
    }

    /**
     * Test case for authentication failure with empty username.
     */
    @Test
    void testAuthenticateEmptyUsername() {
        Login login = new Login();
        login.setUsername("");
        login.setPassword("testpass");
        login.setIpAddr("127.0.0.1");
        assertThrows(LoginException.class, () -> {
            login.authenticate();
        });
    }

    /**
     * Test case for authentication failure with empty password.
     */
    @Test
    void testAuthenticateEmptyPassword() {
        Login login = new Login();
        login.setUsername("testuser");
        login.setPassword("");
        login.setIpAddr("127.0.0.1");
        assertThrows(LoginException.class, () -> {
            login.authenticate();
        });
    }

    /**
     * Test case for authentication failure with empty IP address.
     */
    @Test
    void testAuthenticateEmptyIpAddr() {
        Login login = new Login();
        login.setUsername("testuser");
        login.setPassword("testpass");
        login.setIpAddr("");
        assertThrows(LoginException.class, () -> {
            login.authenticate();
        });
    }

    /**
     * Test case for authentication failure with null username.
     */
    @Test
    void testAuthenticateNullUsername() {
        Login login = new Login();
        login.setUsername(null);
        login.setPassword("testpass");
        login.setIpAddr("127.0.0.1");
        assertThrows(LoginException.class, () -> {
            login.authenticate();
        });
    }

    /**
     * Test case for authentication failure with null password.
     */
    @Test
    void testAuthenticateNullPassword() {
        Login login = new Login();
        login.setUsername("testuser");
        login.setPassword(null);
        login.setIpAddr("127.0.0.1");
        assertThrows(LoginException.class, () -> {
            login.authenticate();
        });
    }

    /**
     * Test case for authentication failure with null IP address.
     */
    @Test
    void testAuthenticateNullIpAddr() {
        Login login = new Login();
        login.setUsername("testuser");
        login.setPassword("testpass");
        login.setIpAddr(null);
        assertThrows(LoginException.class, () -> {
            login.authenticate();
        });
    }

    /**
     * Test case for authentication failure with invalid IP address format.
     */
    @Test
    void testAuthenticateInvalidIpAddr() {
        Login login = new Login();
        login.setUsername("testuser");
        login.setPassword("testpass");
        login.setIpAddr("invalid");
        assertThrows(LoginException.class, () -> {
            login.authenticate();
        });
    }

    /**
     * Test case for authentication failure with non-existent user.
     */
    @Test
    void testAuthenticateNonExistentUser() {
        Login login = new Login();
        login.setUsername("nonexistent");
        login.setPassword("testpass");
        login.setIpAddr("127.0.0.1");
        assertThrows(LoginException.class, () -> {
            login.authenticate();
        });
    }
}