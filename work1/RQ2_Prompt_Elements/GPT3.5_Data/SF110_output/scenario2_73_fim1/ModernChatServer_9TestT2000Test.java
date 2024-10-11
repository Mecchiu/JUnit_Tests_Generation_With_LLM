// ModernChatServer_9Test.java
package osa.ora.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModernChatServer}.
 * It contains ten unit test cases for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
 */
class ModernChatServer_9Test {

    private ModernChatServer server;

    @BeforeEach
    void setUp() {
        server = new ModernChatServer();
    }

    @Test
    void testSignInAsAdminWithValidCredentials() {
        String email = "admin@example.com";
        String password = "admin123";
        assertNotNull(server.signInAsAdmin(email, password));
    }

    @Test
    void testSignInAsAdminWithInvalidEmail() {
        String email = "invalid@example.com";
        String password = "admin123";
        assertNull(server.signInAsAdmin(email, password));
    }

    @Test
    void testSignInAsAdminWithInvalidPassword() {
        String email = "admin@example.com";
        String password = "invalid";
        assertNull(server.signInAsAdmin(email, password));
    }

    @Test
    void testSignInAsAdminWithNullEmail() {
        String email = null;
        String password = "admin123";
        assertNull(server.signInAsAdmin(email, password));
    }

    @Test
    void testSignInAsAdminWithNullPassword() {
        String email = "admin@example.com";
        String password = null;
        assertNull(server.signInAsAdmin(email, password));
    }

    @Test
    void testSignInAsAdminWithNullCredentials() {
        String email = null;
        String password = null;
        assertNull(server.signInAsAdmin(email, password));
    }

    @Test
    void testSignInAsAdminWithEmptyEmail() {
        String email = "";
        String password = "admin123";
        assertNull(server.signInAsAdmin(email, password));
    }

    @Test
    void testSignInAsAdminWithEmptyPassword() {
        String email = "admin@example.com";
        String password = "";
        assertNull(server.signInAsAdmin(email, password));
    }

    @Test
    void testSignInAsAdminWithEmptyCredentials() {
        String email = "";
        String password = "";
        assertNull(server.signInAsAdmin(email, password));
    }

    @Test
    void testSignInAsAdminReturnsAuthToken() {
        String email = "admin@example.com";
        String password = "admin123";
        assertNotNull(server.signInAsAdmin(email, password).getAuthToken());
    }
}