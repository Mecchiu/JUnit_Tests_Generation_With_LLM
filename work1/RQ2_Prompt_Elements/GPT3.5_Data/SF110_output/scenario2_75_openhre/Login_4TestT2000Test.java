// Login_4Test.java
package com.browsersoft.aacs;

import org.junit.jupiter.api.Test;
import javax.security.auth.login.LoginException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Login}.
 * It contains ten unit test cases for the {@link Login#authenticate()} method.
 */
class Login_4Test {

    @Test
    void testAuthenticateWithValidCredentials() {
        // Arrange
        Login login = new Login();
        login.setUserMgr(new UserMgr());
        login.setUsername("testuser");
        login.setUserid("testuser");
        login.setPassword("testpassword");
        login.setAuthType("testauth");
        login.setIpAddr("127.0.0.1");

        // Act
        User user = null;
        try {
            user = login.authenticate();
        } catch (LoginException e) {
            fail("Unexpected LoginException: " + e.getMessage());
        }

        // Assert
        assertNotNull(user);
        assertEquals("testuser", user.getUsername());
        assertEquals("testuser", user.getUserid());
        assertEquals("testauth", user.getAuthType());
        assertEquals("127.0.0.1", user.getIpAddr());
    }

    @Test
    void testAuthenticateWithInvalidPassword() {
        // Arrange
        Login login = new Login();
        login.setUserMgr(new UserMgr());
        login.setUsername("testuser");
        login.setUserid("testuser");
        login.setPassword("wrongpassword");
        login.setAuthType("testauth");
        login.setIpAddr("127.0.0.1");

        // Act & Assert
        assertThrows(LoginException.class, login::authenticate);
    }

    @Test
    void testAuthenticateWithoutUserMgr() {
        // Arrange
        Login login = new Login();
        login.setUsername("testuser");
        login.setUserid("testuser");
        login.setPassword("testpassword");
        login.setAuthType("testauth");
        login.setIpAddr("127.0.0.1");

        // Act & Assert
        assertThrows(LoginException.class, login::authenticate);
    }

    @Test
    void testAuthenticateWithoutPassword() {
        // Arrange
        Login login = new Login();
        login.setUserMgr(new UserMgr());
        login.setUsername("testuser");
        login.setUserid("testuser");
        login.setAuthType("testauth");
        login.setIpAddr("127.0.0.1");

        // Act & Assert
        assertThrows(LoginException.class, login::authenticate);
    }

    @Test
    void testAuthenticateWithNullUser() {
        // Arrange
        Login login = new Login();
        login.setUserMgr(new UserMgr());
        login.setUsername("nonexistentuser");
        login.setUserid("nonexistentuser");
        login.setPassword("testpassword");
        login.setAuthType("testauth");
        login.setIpAddr("127.0.0.1");

        // Act & Assert
        assertThrows(LoginException.class, login::authenticate);
    }

    @Test
    void testAuthenticateWithNullUsername() {
        // Arrange
        Login login = new Login();
        login.setUserMgr(new UserMgr());
        login.setUserid("testuser");
        login.setPassword("testpassword");
        login.setAuthType("testauth");
        login.setIpAddr("127.0.0.1");

        // Act & Assert
        assertThrows(LoginException.class, login::authenticate);
    }

    @Test
    void testAuthenticateWithNullUserid() {
        // Arrange
        Login login = new Login();
        login.setUserMgr(new UserMgr());
        login.setUsername("testuser");
        login.setPassword("testpassword");
        login.setAuthType("testauth");
        login.setIpAddr("127.0.0.1");

        // Act & Assert
        assertThrows(LoginException.class, login::authenticate);
    }

    @Test
    void testAuthenticateWithNullAuthType() {
        // Arrange
        Login login = new Login();
        login.setUserMgr(new UserMgr());
        login.setUsername("testuser");
        login.setUserid("testuser");
        login.setPassword("testpassword");
        login.setIpAddr("127.0.0.1");

        // Act & Assert
        assertThrows(LoginException.class, login::authenticate);
    }

    @Test
    void testAuthenticateWithNullIpAddr() {
        // Arrange
        Login login = new Login();
        login.setUserMgr(new UserMgr());
        login.setUsername("testuser");
        login.setUserid("testuser");
        login.setPassword("testpassword");
        login.setAuthType("testauth");

        // Act & Assert
        assertThrows(LoginException.class, login::authenticate);
    }

    @Test
    void testAuthenticateWithEmptyPassword() {
        // Arrange
        Login login = new Login();
        login.setUserMgr(new UserMgr());
        login.setUsername("testuser");
        login.setUserid("testuser");
        login.setPassword("");
        login.setAuthType("testauth");
        login.setIpAddr("127.0.0.1");

        // Act & Assert
        assertThrows(LoginException.class, login::authenticate);
    }
}