```java
class ModernChatServer_3Test {

    @Test
    void testChangePassword_Success() {
        ModernChatServer server = new ModernChatServer();
        User user = new User();
        user.setId(1);
        String email = "test@example.com";
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        ResultBean result = server.changePassword(email, oldPass, newPass);
        assertTrue(result.isSuccess());
    }

    @Test
    void testChangePassword_InvalidPassword() {
        ModernChatServer server = new ModernChatServer();
        User user = new User();
        user.setId(1);
        String email = "test@example.com";
        String oldPass = "invalidPassword";
        String newPass = "newPassword";
        ResultBean result = server.changePassword(email, oldPass, newPass);
        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getCode());
    }

    @Test
    void testChangePassword_NullCredentials() {
        ModernChatServer server = new ModernChatServer();
        String email = null;
        String oldPass = null;
        String newPass = null;
        ResultBean result = server.changePassword(email, oldPass, newPass);
        assertNull(result);
    }

    @Test
    void testChangePassword_AdminUser() {
        ModernChatServer server = new ModernChatServer();
        User adminUser = server.getAdminUser();
        String email = adminUser.getEmail();
        String oldPass = "adminPassword";
        String newPass = "newAdminPassword";
        ResultBean result = server.changePassword(email, oldPass, newPass);
        assertTrue(result.isSuccess());
    }

    @Test
    void testChangePassword_UpdatePassword() {
        ModernChatServer server = new ModernChatServer();
        User user = new User();
        user.setId(1);
        String email = "test@example.com";
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        server.changePassword(email, oldPass, newPass);
        User updatedUser = server.authenticateUser(email, newPass);
        assertNotNull(updatedUser);
    }

    @Test
    void testChangePassword_AdminUserUpdatePassword() {
        ModernChatServer server = new ModernChatServer();
        User adminUser = server.getAdminUser();
        String email = adminUser.getEmail();
        String oldPass = "adminPassword";
        String newPass = "newAdminPassword";
        server.changePassword(email, oldPass, newPass);
        User updatedAdminUser = server.authenticateUser(email, newPass);
        assertNotNull(updatedAdminUser);
    }

    @Test
    void testChangePassword_InvalidAuthToken() {
        ModernChatServer server = new ModernChatServer();
        String authToken = "invalidToken";
        String email = "test@example.com";
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        assertThrows(RemoteException.class, () -> {
            server.changePassword(email, oldPass, newPass, authToken);
        });
    }

    @Test
    void testChangePassword_NullResult() {
        ModernChatServer server = new ModernChatServer();
        User user = new User();
        user.setId(1);
        String email = "test@example.com";
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        ResultBean result = server.changePassword(email, oldPass, newPass);
        assertNull(result.getMessage());
    }

    @Test
    void testChangePassword_UpdatePasswordFailure() {
        ModernChatServer server = new ModernChatServer();
        User user = new User();
        user.setId(1);
        String email = "test@example.com";
        String oldPass = "oldPassword";
        String newPass = "newPassword";
        server.changePassword(email, oldPass, newPass);
        User updatedUser = server.authenticateUser(email, oldPass);
        assertNull(updatedUser);
    }
}
```