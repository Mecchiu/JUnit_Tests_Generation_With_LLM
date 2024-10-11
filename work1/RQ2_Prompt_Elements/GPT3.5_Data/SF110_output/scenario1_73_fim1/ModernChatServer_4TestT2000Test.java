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
        String emailAddr = "admin@example.com";
        String oldPass = "admin123";
        String newPass = "newAdmin123";
        try {
            server.signInAsAdmin(emailAddr, oldPass);
            ResultBean result = server.changeAdminPassword(emailAddr, oldPass, newPass);
            assertTrue(result.isSuccess());
            assertEquals("Password changed successfully.", result.getMessage());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithInvalidOldPassword() {
        String emailAddr = "admin@example.com";
        String oldPass = "invalidOldPass";
        String newPass = "newAdmin123";
        try {
            ResultBean result = server.changeAdminPassword(emailAddr, oldPass, newPass);
            assertFalse(result.isSuccess());
            assertEquals("Invalid Password!", result.getMessage());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithInvalidEmail() {
        String emailAddr = "invalidEmail@example.com";
        String oldPass = "admin123";
        String newPass = "newAdmin123";
        try {
            ResultBean result = server.changeAdminPassword(emailAddr, oldPass, newPass);
            assertFalse(result.isSuccess());
            assertEquals("Invalid Email Address!", result.getMessage());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithEmptyOldPassword() {
        String emailAddr = "admin@example.com";
        String oldPass = "";
        String newPass = "newAdmin123";
        try {
            ResultBean result = server.changeAdminPassword(emailAddr, oldPass, newPass);
            assertFalse(result.isSuccess());
            assertEquals("Invalid Password!", result.getMessage());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithEmptyNewPassword() {
        String emailAddr = "admin@example.com";
        String oldPass = "admin123";
        String newPass = "";
        try {
            ResultBean result = server.changeAdminPassword(emailAddr, oldPass, newPass);
            assertFalse(result.isSuccess());
            assertEquals("Invalid Password!", result.getMessage());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithNullOldPassword() {
        String emailAddr = "admin@example.com";
        String oldPass = null;
        String newPass = "newAdmin123";
        try {
            ResultBean result = server.changeAdminPassword(emailAddr, oldPass, newPass);
            assertFalse(result.isSuccess());
            assertEquals("Invalid Password!", result.getMessage());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithNullNewPassword() {
        String emailAddr = "admin@example.com";
        String oldPass = "admin123";
        String newPass = null;
        try {
            ResultBean result = server.changeAdminPassword(emailAddr, oldPass, newPass);
            assertFalse(result.isSuccess());
            assertEquals("Invalid Password!", result.getMessage());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithShortNewPassword() {
        String emailAddr = "admin@example.com";
        String oldPass = "admin123";
        String newPass = "new";
        try {
            ResultBean result = server.changeAdminPassword(emailAddr, oldPass, newPass);
            assertFalse(result.isSuccess());
            assertEquals("Password must be at least 8 characters long.", result.getMessage());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testChangeAdminPasswordWithLongNewPassword() {
        String emailAddr = "admin@example.com";
        String oldPass = "admin123";
        String newPass = "newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123newAdmin123new