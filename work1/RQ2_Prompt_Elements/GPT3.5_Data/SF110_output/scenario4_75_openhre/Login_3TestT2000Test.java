// Login_3Test.java
package com.browsersoft.aacs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Login}.
 * It contains ten unit test cases for the {@link Login#authorize()} method.
 */
class Login_3Test {

    /**
     * Test case for authorizing a user with valid credentials.
     * Expected result: the user is authorized successfully.
     */
    @Test
    void testAuthorizeValidCredentials() {
        Login login = new Login();
        login.setUsername("validuser");
        login.setPassword("validpassword");
        try {
            User user = login.authorize();
            assertNotNull(user);
        } catch (LoginException e) {
            fail("Authorization failed with valid credentials.");
        }
    }

    /**
     * Test case for authorizing a user with invalid credentials.
     * Expected result: a LoginException is thrown.
     */
    @Test
    void testAuthorizeInvalidCredentials() {
        Login login = new Login();
        login.setUsername("invaliduser");
        login.setPassword("invalidpassword");
        assertThrows(LoginException.class, () -> {
            login.authorize();
        });
    }

    /**
     * Test case for authorizing a user with empty username.
     * Expected result: a LoginException is thrown.
     */
    @Test
    void testAuthorizeEmptyUsername() {
        Login login = new Login();
        login.setUsername("");
        login.setPassword("validpassword");
        assertThrows(LoginException.class, () -> {
            login.authorize();
        });
    }

    /**
     * Test case for authorizing a user with empty password.
     * Expected result: a LoginException is thrown.
     */
    @Test
    void testAuthorizeEmptyPassword() {
        Login login = new Login();
        login.setUsername("validuser");
        login.setPassword("");
        assertThrows(LoginException.class, () -> {
            login.authorize();
        });
    }

    /**
     * Test case for authorizing a user with null username.
     * Expected result: a LoginException is thrown.
     */
    @Test
    void testAuthorizeNullUsername() {
        Login login = new Login();
        login.setUsername(null);
        login.setPassword("validpassword");
        assertThrows(LoginException.class, () -> {
            login.authorize();
        });
    }

    /**
     * Test case for authorizing a user with null password.
     * Expected result: a LoginException is thrown.
     */
    @Test
    void testAuthorizeNullPassword() {
        Login login = new Login();
        login.setUsername("validuser");
        login.setPassword(null);
        assertThrows(LoginException.class, () -> {
            login.authorize();
        });
    }

    /**
     * Test case for authorizing a user with invalid username.
     * Expected result: a LoginException is thrown.
     */
    @Test
    void testAuthorizeInvalidUsername() {
        Login login = new Login();
        login.setUsername("invaliduser");
        login.setPassword("validpassword");
        assertThrows(LoginException.class, () -> {
            login.authorize();
        });
    }

    /**
     * Test case for authorizing a user with invalid password.
     * Expected result: a LoginException is thrown.
     */
    @Test
    void testAuthorizeInvalidPassword() {
        Login login = new Login();
        login.setUsername("validuser");
        login.setPassword("invalidpassword");
        assertThrows(LoginException.class, () -> {
            login.authorize();
        });
    }

    /**
     * Test case for authorizing a user with null credentials.
     * Expected result: a LoginException is thrown.
     */
    @Test
    void testAuthorizeNullCredentials() {
        Login login = new Login();
        login.setUsername(null);
        login.setPassword(null);
        assertThrows(LoginException.class, () -> {
            login.authorize();
        });
    }

    /**
     * Test case for authorizing a user with whitespace username and password.
     * Expected result: a LoginException is thrown.
     */
    @Test
    void testAuthorizeWhitespaceCredentials() {
        Login login = new Login();
        login.setUsername("   ");
        login.setPassword("   ");
        assertThrows(LoginException.class, () -> {
            login.authorize();
        });
    }
}