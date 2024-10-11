// ModernChatServer_3Test.java
package osa.ora.server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.rmi.RemoteException;
import osa.ora.server.beans.ResultBean;

/**
* Test class of {@link ModernChatServer}.
* It contains ten unit test cases for the {@link ModernChatServer#changePassword(String, String, String)} method.
*/
class ModernChatServer_3Test {
    
    /**
     * Test case for changing password with correct old password and new password.
     * Expected result is true.
     */
    @Test
    void testChangePasswordWithCorrectOldAndNewPassword() {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = null;
        try {
            result = server.changePassword("test@test.com", "oldPassword", "newPassword");
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertTrue(result.isSuccess());
    }
    
    /**
     * Test case for changing password with incorrect old password and new password.
     * Expected result is false.
     */
    @Test
    void testChangePasswordWithIncorrectOldAndNewPassword() {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = null;
        try {
            result = server.changePassword("test@test.com", "wrongPassword", "newPassword");
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertFalse(result.isSuccess());
    }
    
    /**
     * Test case for changing password with correct old password and empty new password.
     * Expected result is false.
     */
    @Test
    void testChangePasswordWithCorrectOldAndEmptyNewPassword() {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = null;
        try {
            result = server.changePassword("test@test.com", "oldPassword", "");
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertFalse(result.isSuccess());
    }
    
    /**
     * Test case for changing password with incorrect old password and empty new password.
     * Expected result is false.
     */
    @Test
    void testChangePasswordWithIncorrectOldAndEmptyNewPassword() {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = null;
        try {
            result = server.changePassword("test@test.com", "wrongPassword", "");
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertFalse(result.isSuccess());
    }
    
    /**
     * Test case for changing password with correct old password and null new password.
     * Expected result is false.
     */
    @Test
    void testChangePasswordWithCorrectOldAndNullNewPassword() {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = null;
        try {
            result = server.changePassword("test@test.com", "oldPassword", null);
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertFalse(result.isSuccess());
    }
    
    /**
     * Test case for changing password with incorrect old password and null new password.
     * Expected result is false.
     */
    @Test
    void testChangePasswordWithIncorrectOldAndNullNewPassword() {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = null;
        try {
            result = server.changePassword("test@test.com", "wrongPassword", null);
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertFalse(result.isSuccess());
    }
    
    /**
     * Test case for changing password with empty email, old password and new password.
     * Expected result is false.
     */
    @Test
    void testChangePasswordWithEmptyEmailOldAndNewPassword() {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = null;
        try {
            result = server.changePassword("", "", "");
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertFalse(result.isSuccess());
    }
    
    /**
     * Test case for changing password with null email, old password and new password.
     * Expected result is false.
     */
    @Test
    void testChangePasswordWithNullEmailOldAndNewPassword() {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = null;
        try {
            result = server.changePassword(null, "", "");
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertFalse(result.isSuccess());
    }
    
    /**
     * Test case for changing password with correct email and empty old and new password.
     * Expected result is false.
     */
    @Test
    void testChangePasswordWithCorrectEmailAndEmptyOldAndNewPassword() {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = null;
        try {
            result = server.changePassword("test@test.com", "", "");
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertFalse(result.isSuccess());
    }
    
    /**
     * Test case for changing password with correct email and null old and new password.
     * Expected result is false.
     */
    @Test
    void testChangePasswordWithCorrectEmailAndNullOldAndNewPassword() {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = null;
        try {
            result = server.changePassword("test@test.com", null, null);
        } catch (RemoteException e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertFalse(result.isSuccess());
    }
}