// ModernChatServer_2Test.java
package osa.ora.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import osa.ora.server.client.ClientInterface;
import osa.ora.server.beans.LoginBean;
import osa.ora.server.beans.User;

/**
 * Test class of {@link ModernChatServer}.
 * It contains ten unit test cases for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
 */
class ModernChatServer_2Test {
    
    private ModernChatServer server;
    private ClientInterface client;
    
    @BeforeEach
    void setUp() {
        server = new ModernChatServer();
        client = new ClientInterfaceImpl();
    }
    
    @Test
    void testSignInWithValidCredentials() {
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, "test@example.com", "password", "127.0.0.1");
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNotNull(loginBean);
        User user = loginBean.getUser();
        assertNotNull(user);
        assertEquals("test@example.com", user.getEmail());
    }
    
    @Test
    void testSignInWithInvalidEmail() {
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, "invalid@example.com", "password", "127.0.0.1");
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithInvalidPassword() {
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, "test@example.com", "invalid", "127.0.0.1");
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithNullEmail() {
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, null, "password", "127.0.0.1");
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithNullPassword() {
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, "test@example.com", null, "127.0.0.1");
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithNullIpAddress() {
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, "test@example.com", "password", null);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithNullCredentials() {
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, null, null, null);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithEmptyEmail() {
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, "", "password", "127.0.0.1");
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithEmptyPassword() {
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, "test@example.com", "", "127.0.0.1");
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithEmptyIpAddress() {
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, "test@example.com", "password", "");
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
}