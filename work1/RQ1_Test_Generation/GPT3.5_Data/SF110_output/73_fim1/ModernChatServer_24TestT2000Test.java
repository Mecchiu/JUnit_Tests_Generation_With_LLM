```java
class ModernChatServer_24Test {

    @Test
    void testSignInAsAdmin_ValidCredentials() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String email = "admin@example.com";
        String password = "admin123";
        LoginBean loginBean = modernChatServer.signInAsAdmin(StringEncoder64.encodeStringUTF8(email), StringEncrypter.getInstance("FIS2009").encrypt(password));
        assertNotNull(loginBean);
        assertEquals("System Admin", loginBean.getUser().getUsername());
    }

    @Test
    void testSignInAsAdmin_InvalidCredentials() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String email = "invalid@example.com";
        String password = "invalid123";
        LoginBean loginBean = modernChatServer.signInAsAdmin(StringEncoder64.encodeStringUTF8(email), StringEncrypter.getInstance("FIS2009").encrypt(password));
        assertNull(loginBean);
    }

    @Test
    void testSignInAsAdmin_NullCredentials() {
        ModernChatServer modernChatServer = new ModernChatServer();
        LoginBean loginBean = modernChatServer.signInAsAdmin(null, null);
        assertNull(loginBean);
    }

    @Test
    void testSignInAsAdmin_EmptyCredentials() {
        ModernChatServer modernChatServer = new ModernChatServer();
        LoginBean loginBean = modernChatServer.signInAsAdmin("", "");
        assertNull(loginBean);
    }

    @Test
    void testSignInAsAdmin_IncorrectPassword() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String email = "admin@example.com";
        String password = "incorrect";
        LoginBean loginBean = modernChatServer.signInAsAdmin(StringEncoder64.encodeStringUTF8(email), StringEncrypter.getInstance("FIS2009").encrypt(password));
        assertNull(loginBean);
    }

    @Test
    void testSignInAsAdmin_NullEmail() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String password = "admin123";
        LoginBean loginBean = modernChatServer.signInAsAdmin(null, StringEncrypter.getInstance("FIS2009").encrypt(password));
        assertNull(loginBean);
    }

    @Test
    void testSignInAsAdmin_NullPassword() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String email = "admin@example.com";
        LoginBean loginBean = modernChatServer.signInAsAdmin(StringEncoder64.encodeStringUTF8(email), null);
        assertNull(loginBean);
    }

    @Test
    void testSignInAsAdmin_EmptyEmail() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String password = "admin123";
        LoginBean loginBean = modernChatServer.signInAsAdmin("", StringEncrypter.getInstance("FIS2009").encrypt(password));
        assertNull(loginBean);
    }

    @Test
    void testSignInAsAdmin_EmptyPassword() {
        ModernChatServer modernChatServer = new ModernChatServer();
        String email = "admin@example.com";
        LoginBean loginBean = modernChatServer.signInAsAdmin(StringEncoder64.encodeStringUTF8(email), "");
        assertNull(loginBean);
    }
}
```