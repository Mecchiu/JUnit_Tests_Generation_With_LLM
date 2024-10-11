// ModernChatServer_4Test.java
package osa.ora.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModernChatServer}.
 * It contains ten unit test cases for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
 */
class ModernChatServer_4Test {

    private ModernChatServer server;

    @BeforeEach
    void setUp() {
        server = new ModernChatServer();
    }

    @Test
    void testChangeAdminPasswordWithValidCredentials() {
        String email = "admin@example.com";
        String oldPass = "admin123";
        String newPass = "newAdmin123";
        try {
            server.signInAsAdmin(email, oldPass);
            assertTrue(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithInvalidEmail() {
        String email = "invalid@example.com";
        String oldPass = "admin123";
        String newPass = "newAdmin123";
        try {
            assertNull(server.signInAsAdmin(email, oldPass));
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithInvalidOldPassword() {
        String email = "admin@example.com";
        String oldPass = "invalid123";
        String newPass = "newAdmin123";
        try {
            assertNull(server.signInAsAdmin(email, oldPass));
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithInvalidNewPassword() {
        String email = "admin@example.com";
        String oldPass = "admin123";
        String newPass = "";
        try {
            server.signInAsAdmin(email, oldPass);
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithSameOldAndNewPassword() {
        String email = "admin@example.com";
        String oldPass = "admin123";
        String newPass = "admin123";
        try {
            server.signInAsAdmin(email, oldPass);
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithNullEmail() {
        String email = null;
        String oldPass = "admin123";
        String newPass = "newAdmin123";
        try {
            assertNull(server.signInAsAdmin(email, oldPass));
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithNullOldPassword() {
        String email = "admin@example.com";
        String oldPass = null;
        String newPass = "newAdmin123";
        try {
            assertNull(server.signInAsAdmin(email, oldPass));
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithNullNewPassword() {
        String email = "admin@example.com";
        String oldPass = "admin123";
        String newPass = null;
        try {
            server.signInAsAdmin(email, oldPass);
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithEmptyEmail() {
        String email = "";
        String oldPass = "admin123";
        String newPass = "newAdmin123";
        try {
            assertNull(server.signInAsAdmin(email, oldPass));
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithEmptyOldPassword() {
        String email = "admin@example.com";
        String oldPass = "";
        String newPass = "newAdmin123";
        try {
            assertNull(server.signInAsAdmin(email, oldPass));
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithEmptyNewPassword() {
        String email = "admin@example.com";
        String oldPass = "admin123";
        String newPass = "";
        try {
            server.signInAsAdmin(email, oldPass);
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}