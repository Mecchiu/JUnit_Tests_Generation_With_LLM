// ModernChatServer_3Test.java
package osa.ora.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModernChatServer}.
 * It contains ten unit test cases for the {@link ModernChatServer#changePassword(String, String, String)} method.
 */
class ModernChatServer_3Test {

    private ModernChatServer server;

    @BeforeEach
    void setUp() {
        server = new ModernChatServer();
    }

    @Test
    void testChangePasswordWithValidCredentials() {
        String email = "test@example.com";
        String oldPass = "password";
        String newPass = "newpassword";
        assertTrue(server.changePassword(email, oldPass, newPass).isSuccess());
    }

    @Test
    void testChangePasswordWithInvalidEmail() {
        String email = "invalid@example.com";
        String oldPass = "password";
        String newPass = "newpassword";
        assertFalse(server.changePassword(email, oldPass, newPass).isSuccess());
    }

    @Test
    void testChangePasswordWithInvalidOldPassword() {
        String email = "test@example.com";
        String oldPass = "invalidpassword";
        String newPass = "newpassword";
        assertFalse(server.changePassword(email, oldPass, newPass).isSuccess());
    }

    @Test
    void testChangePasswordWithInvalidNewPassword() {
        String email = "test@example.com";
        String oldPass = "password";
        String newPass = "";
        assertFalse(server.changePassword(email, oldPass, newPass).isSuccess());
    }

    @Test
    void testChangePasswordWithSameOldAndNewPassword() {
        String email = "test@example.com";
        String oldPass = "password";
        String newPass = "password";
        assertFalse(server.changePassword(email, oldPass, newPass).isSuccess());
    }

    @Test
    void testChangePasswordWithNullEmail() {
        String email = null;
        String oldPass = "password";
        String newPass = "newpassword";
        assertFalse(server.changePassword(email, oldPass, newPass).isSuccess());
    }

    @Test
    void testChangePasswordWithNullOldPassword() {
        String email = "test@example.com";
        String oldPass = null;
        String newPass = "newpassword";
        assertFalse(server.changePassword(email, oldPass, newPass).isSuccess());
    }

    @Test
    void testChangePasswordWithNullNewPassword() {
        String email = "test@example.com";
        String oldPass = "password";
        String newPass = null;
        assertFalse(server.changePassword(email, oldPass, newPass).isSuccess());
    }

    @Test
    void testChangePasswordWithEmptyEmail() {
        String email = "";
        String oldPass = "password";
        String newPass = "newpassword";
        assertFalse(server.changePassword(email, oldPass, newPass).isSuccess());
    }

    @Test
    void testChangePasswordWithEmptyOldPassword() {
        String email = "test@example.com";
        String oldPass = "";
        String newPass = "newpassword";
        assertFalse(server.changePassword(email, oldPass, newPass).isSuccess());
    }
}