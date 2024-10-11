// ModernChatServer_9Test.java
package osa.ora.server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import osa.ora.server.beans.LoginBean;

/**
* Test class of {@link ModernChatServer}.
* It contains ten unit test cases for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
*/
class ModernChatServer_9Test {
    
    /**
     * Test case for successful authentication of admin user.
     */
    @Test
    void testSignInAsAdminSuccess() {
        ModernChatServer server = new ModernChatServer();
        LoginBean result = server.signInAsAdmin("admin@example.com", "admin123");
        assertNotNull(result);
        assertEquals("admin@example.com", result.getEmail());
        assertEquals("Admin", result.getRole());
    }
    
    /**
     * Test case for authentication failure due to incorrect email.
     */
    @Test
    void testSignInAsAdminIncorrectEmail() {
        ModernChatServer server = new ModernChatServer();
        LoginBean result = server.signInAsAdmin("wrongemail@example.com", "admin123");
        assertNull(result);
    }
    
    /**
     * Test case for authentication failure due to incorrect password.
     */
    @Test
    void testSignInAsAdminIncorrectPassword() {
        ModernChatServer server = new ModernChatServer();
        LoginBean result = server.signInAsAdmin("admin@example.com", "wrongpassword");
        assertNull(result);
    }
    
    /**
     * Test case for authentication failure due to empty email.
     */
    @Test
    void testSignInAsAdminEmptyEmail() {
        ModernChatServer server = new ModernChatServer();
        LoginBean result = server.signInAsAdmin("", "admin123");
        assertNull(result);
    }
    
    /**
     * Test case for authentication failure due to empty password.
     */
    @Test
    void testSignInAsAdminEmptyPassword() {
        ModernChatServer server = new ModernChatServer();
        LoginBean result = server.signInAsAdmin("admin@example.com", "");
        assertNull(result);
    }
    
    /**
     * Test case for authentication failure due to null email.
     */
    @Test
    void testSignInAsAdminNullEmail() {
        ModernChatServer server = new ModernChatServer();
        LoginBean result = server.signInAsAdmin(null, "admin123");
        assertNull(result);
    }
    
    /**
     * Test case for authentication failure due to null password.
     */
    @Test
    void testSignInAsAdminNullPassword() {
        ModernChatServer server = new ModernChatServer();
        LoginBean result = server.signInAsAdmin("admin@example.com", null);
        assertNull(result);
    }
    
    /**
     * Test case for authentication failure due to invalid email format.
     */
    @Test
    void testSignInAsAdminInvalidEmailFormat() {
        ModernChatServer server = new ModernChatServer();
        LoginBean result = server.signInAsAdmin("invalidemailformat", "admin123");
        assertNull(result);
    }
    
    /**
     * Test case for authentication failure due to email with leading/trailing spaces.
     */
    @Test
    void testSignInAsAdminEmailWithSpaces() {
        ModernChatServer server = new ModernChatServer();
        LoginBean result = server.signInAsAdmin("  admin@example.com  ", "admin123");
        assertNotNull(result);
        assertEquals("admin@example.com", result.getEmail());
        assertEquals("Admin", result.getRole());
    }
    
    /**
     * Test case for authentication failure due to password with leading/trailing spaces.
     */
    @Test
    void testSignInAsAdminPasswordWithSpaces() {
        ModernChatServer server = new ModernChatServer();
        LoginBean result = server.signInAsAdmin("admin@example.com", "  admin123  ");
        assertNull(result);
    }
}