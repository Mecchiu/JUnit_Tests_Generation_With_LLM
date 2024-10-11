```java
public class ModernChatServer_4Test {

    @Test
    void testChangeAdminPassword_Success() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String emailAddr = "admin@example.com";
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        ResultBean result = modernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
        assertTrue(result.isSuccess());
    }

    @Test
    void testChangeAdminPassword_InvalidPassword() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String emailAddr = "admin@example.com";
        String oldPass = "invalidPassword";
        String newPass = "newPassword";
        ResultBean result = modernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
        assertFalse(result.isSuccess());
        assertEquals("Invalid Password!", result.getMessage());
    }

    @Test
    void testChangeAdminPassword_Error() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String emailAddr = "admin@example.com";
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        // Simulate an error during password update
        modernChatServer.getServerSettingBean().setServerURL(null);
        ResultBean result = modernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
        assertFalse(result.isSuccess());
        assertEquals("Error During Applying New Password!", result.getMessage());
    }

    @Test
    void testChangeAdminPassword_NullCredentials() {
        ModernChatServer modernChatServer = new ModernChatServer();
        ResultBean result = modernChatServer.changeAdminPassword(null, null, null);
        assertNull(result);
    }

    @Test
    void testChangeAdminPassword_InvalidToken() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String emailAddr = "admin@example.com";
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        assertThrows(RemoteException.class, () -> modernChatServer.changeAdminPassword(emailAddr, oldPass, newPass, "invalidToken"));
    }

    @Test
    void testChangeAdminPassword_NullUser() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String emailAddr = "invalid@example.com";
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        ResultBean result = modernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
        assertNull(result);
    }

    @Test
    void testChangeAdminPassword_NullUserPassword() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String emailAddr = "admin@example.com";
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        modernChatServer.getPasswords().put(1000, null);
        ResultBean result = modernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
        assertFalse(result.isSuccess());
        assertEquals("Invalid Password!", result.getMessage());
    }

    @Test
    void testChangeAdminPassword_NullUserEmail() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String emailAddr = null;
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        ResultBean result = modernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
        assertFalse(result.isSuccess());
        assertEquals("Invalid Password!", result.getMessage());
    }

    @Test
    void testChangeAdminPassword_NullOldPassword() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String emailAddr = "admin@example.com";
        String oldPass = null;
        String newPass = "newPassword";
        ResultBean result = modernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
        assertFalse(result.isSuccess());
        assertEquals("Invalid Password!", result.getMessage());
    }

    @Test
    void testChangeAdminPassword_NullNewPassword() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String emailAddr = "admin@example.com";
        String oldPass = "oldPassword";
        String newPass = null;
        ResultBean result = modernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
        assertFalse(result.isSuccess());
        assertEquals("Invalid Password!", result.getMessage());
    }
}
```