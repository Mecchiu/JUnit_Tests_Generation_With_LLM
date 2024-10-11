// ModernChatServer_4Test.java
package osa.ora.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.rmi.RemoteException;

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
        try {
            String email = "admin@example.com";
            String oldPass = "password";
            String newPass = "newpassword";
            assertTrue(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithInvalidEmail() {
        try {
            String email = "invalid@example.com";
            String oldPass = "password";
            String newPass = "newpassword";
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithInvalidOldPassword() {
        try {
            String email = "admin@example.com";
            String oldPass = "invalidpassword";
            String newPass = "newpassword";
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithInvalidNewPassword() {
        try {
            String email = "admin@example.com";
            String oldPass = "password";
            String newPass = "";
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithNullEmail() {
        try {
            String email = null;
            String oldPass = "password";
            String newPass = "newpassword";
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithNullOldPassword() {
        try {
            String email = "admin@example.com";
            String oldPass = null;
            String newPass = "newpassword";
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithNullNewPassword() {
        try {
            String email = "admin@example.com";
            String oldPass = "password";
            String newPass = null;
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithEmptyEmail() {
        try {
            String email = "";
            String oldPass = "password";
            String newPass = "newpassword";
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithEmptyOldPassword() {
        try {
            String email = "admin@example.com";
            String oldPass = "";
            String newPass = "newpassword";
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithEmptyNewPassword() {
        try {
            String email = "admin@example.com";
            String oldPass = "password";
            String newPass = "";
            assertFalse(server.changeAdminPassword(email, oldPass, newPass).isSuccess());
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}