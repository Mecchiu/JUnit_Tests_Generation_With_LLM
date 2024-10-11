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
        String email = "test@example.com";
        String password = "password";
        String ipAddress = "127.0.0.1";
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNotNull(loginBean);
        User user = loginBean.getUser();
        assertNotNull(user);
        assertEquals(email, user.getEmail());
    }
    
    @Test
    void testSignInWithInvalidCredentials() {
        String email = "invalid@example.com";
        String password = "password";
        String ipAddress = "127.0.0.1";
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithNullCredentials() {
        String email = null;
        String password = null;
        String ipAddress = null;
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithNullEmail() {
        String email = null;
        String password = "password";
        String ipAddress = "127.0.0.1";
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithNullPassword() {
        String email = "test@example.com";
        String password = null;
        String ipAddress = "127.0.0.1";
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithNullIpAddress() {
        String email = "test@example.com";
        String password = "password";
        String ipAddress = null;
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithEmptyEmail() {
        String email = "";
        String password = "password";
        String ipAddress = "127.0.0.1";
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithEmptyPassword() {
        String email = "test@example.com";
        String password = "";
        String ipAddress = "127.0.0.1";
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithEmptyIpAddress() {
        String email = "test@example.com";
        String password = "password";
        String ipAddress = "";
        LoginBean loginBean = null;
        try {
            loginBean = server.signIn(client, email, password, ipAddress);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertNull(loginBean);
    }
    
    @Test
    void testSignInWithAlreadyConnectedUser() {
        String email = "test@example.com";
        String password = "password";
        String ipAddress = "127.0.0.1";
        LoginBean loginBean = null;
        try {
            // First login
            loginBean = server.signIn(client, email, password, ipAddress);
            assertNotNull(loginBean);
            User user = loginBean.getUser();
            assertNotNull(user);
            assertEquals(email, user.getEmail());
            
            // Second login
            ClientInterface anotherClient = new ClientInterfaceImpl();
            loginBean = server.signIn(anotherClient, email, password, ipAddress);
            assertNull(loginBean);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}

class ClientInterfaceImpl implements ClientInterface {
    // Implement methods of ClientInterface
}