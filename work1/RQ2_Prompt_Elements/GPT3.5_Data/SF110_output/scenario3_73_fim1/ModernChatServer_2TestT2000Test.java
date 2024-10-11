// ModernChatServer_2Test.java
package osa.ora.server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import osa.ora.server.client.ClientInterface;
import osa.ora.server.beans.LoginBean;

/**
* Test class of {@link ModernChatServer}.
* It contains ten unit test cases for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServer_2Test {
    
    /**
     * Test case for successful sign in.
     * Expected result: User object is returned.
     */
    @Test
    void testSignInSuccess() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = "test@test.com";
        String password = "password";
        String ipAddress = "127.0.0.1";
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNotNull(result);
    }
    
    /**
     * Test case for incorrect email address.
     * Expected result: Null is returned.
     */
    @Test
    void testSignInIncorrectEmail() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = "incorrect@test.com";
        String password = "password";
        String ipAddress = "127.0.0.1";
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNull(result);
    }
    
    /**
     * Test case for incorrect password.
     * Expected result: Null is returned.
     */
    @Test
    void testSignInIncorrectPassword() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = "test@test.com";
        String password = "incorrect";
        String ipAddress = "127.0.0.1";
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNull(result);
    }
    
    /**
     * Test case for null email address.
     * Expected result: Null is returned.
     */
    @Test
    void testSignInNullEmail() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = null;
        String password = "password";
        String ipAddress = "127.0.0.1";
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNull(result);
    }
    
    /**
     * Test case for null password.
     * Expected result: Null is returned.
     */
    @Test
    void testSignInNullPassword() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = "test@test.com";
        String password = null;
        String ipAddress = "127.0.0.1";
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNull(result);
    }
    
    /**
     * Test case for null IP address.
     * Expected result: Null is returned.
     */
    @Test
    void testSignInNullIpAddress() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = "test@test.com";
        String password = "password";
        String ipAddress = null;
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNull(result);
    }
    
    /**
     * Test case for empty email address.
     * Expected result: Null is returned.
     */
    @Test
    void testSignInEmptyEmail() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = "";
        String password = "password";
        String ipAddress = "127.0.0.1";
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNull(result);
    }
    
    /**
     * Test case for empty password.
     * Expected result: Null is returned.
     */
    @Test
    void testSignInEmptyPassword() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = "test@test.com";
        String password = "";
        String ipAddress = "127.0.0.1";
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNull(result);
    }
    
    /**
     * Test case for empty IP address.
     * Expected result: Null is returned.
     */
    @Test
    void testSignInEmptyIpAddress() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = "test@test.com";
        String password = "password";
        String ipAddress = "";
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNull(result);
    }
    
    /**
     * Test case for invalid email address format.
     * Expected result: Null is returned.
     */
    @Test
    void testSignInInvalidEmailFormat() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = "invalid";
        String password = "password";
        String ipAddress = "127.0.0.1";
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNull(result);
    }
    
    /**
     * Test case for empty database.
     * Expected result: Null is returned.
     */
    @Test
    void testSignInEmptyDatabase() {
        // Arrange
        ModernChatServer server = new ModernChatServer();
        ClientInterface client = null;
        String email = "test@test.com";
        String password = "password";
        String ipAddress = "127.0.0.1";
        // Empty the database
        UsersBD.getInstance().getUsers().clear();
        
        // Act
        LoginBean result = null;
        try {
            result = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        
        // Assert
        assertNull(result);
    }
}