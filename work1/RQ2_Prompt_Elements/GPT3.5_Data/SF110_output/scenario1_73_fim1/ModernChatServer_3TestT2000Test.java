// ModernChatServer_3Test.java
package osa.ora.server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModernChatServer}.
 * It contains ten unit test cases for the {@link ModernChatServer#changePassword(String, String, String)} method.
 */
class ModernChatServer_3Test {

    private ModernChatServer server;
    private Map<Integer, String> passwords;

    @BeforeEach
    void setUp() {
        server = new ModernChatServer();
        passwords = new HashMap<>();
        passwords.put(1, "password1");
        passwords.put(2, "password2");
    }

    @Test
    void testChangePasswordWithValidCredentials() throws RemoteException {
        String email = "test@example.com";
        String oldPass = "password1";
        String newPass = "newpassword1";
        int userId = 1;

        server.setUserBD(new UsersBD() {
            @Override
            public User authenticateUser(String email, String password) {
                if (email.equals("test@example.com") && password.equals("password1")) {
                    return new User(userId, email, password);
                }
                return null;
            }

            @Override
            public boolean updatePassword(int userId, String oldPass, String newPass) {
                return true;
            }
        });

        server.setPasswords(passwords);

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertTrue(result.isSuccess());
        assertEquals(IConstant.SUCCESS, result.getMessage());
        assertNull(result.getException());

        assertEquals(newPass, passwords.get(userId));
    }

    @Test
    void testChangePasswordWithInvalidOldPassword() throws RemoteException {
        String email = "test@example.com";
        String oldPass = "wrongpassword";
        String newPass = "newpassword1";

        server.setUserBD(new UsersBD() {
            @Override
            public User authenticateUser(String email, String password) {
                return null;
            }

            @Override
            public boolean updatePassword(int userId, String oldPass, String newPass) {
                return false;
            }
        });

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getMessage());
        assertEquals("Invalid Password!", result.getException());
    }

    @Test
    void testChangePasswordWithInvalidEmail() throws RemoteException {
        String email = "invalid@example.com";
        String oldPass = "password1";
        String newPass = "newpassword1";

        server.setUserBD(new UsersBD() {
            @Override
            public User authenticateUser(String email, String password) {
                return null;
            }

            @Override
            public boolean updatePassword(int userId, String oldPass, String newPass) {
                return false;
            }
        });

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getMessage());
        assertEquals("Invalid Password!", result.getException());
    }

    @Test
    void testChangePasswordWithUpdatePasswordError() throws RemoteException {
        String email = "test@example.com";
        String oldPass = "password1";
        String newPass = "newpassword1";

        server.setUserBD(new UsersBD() {
            @Override
            public User authenticateUser(String email, String password) {
                return new User(1, email, password);
            }

            @Override
            public boolean updatePassword(int userId, String oldPass, String newPass) {
                return false;
            }
        });

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getMessage());
        assertEquals("Error During Applying New Password!", result.getException());
    }

    @Test
    void testChangePasswordWithEncryptionError() throws RemoteException {
        String email = "test@example.com";
        String oldPass = "password1";
        String newPass = "newpassword1";

        server.setUserBD(new UsersBD() {
            @Override
            public User authenticateUser(String email, String password) {
                return new User(1, email, password);
            }

            @Override
            public boolean updatePassword(int userId, String oldPass, String newPass) {
                return true;
            }
        });

        server.setSecToken("invalidToken");

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getMessage());
        assertEquals("Error During Applying New Password!", result.getException());
    }

    @Test
    void testChangePasswordWithDecryptionError() throws RemoteException {
        String email = "test@example.com";
        String oldPass = "password1";
        String newPass = "newpassword1";

        server.setUserBD(new UsersBD() {
            @Override
            public User authenticateUser(String email, String password) {
                return new User(1, email, password);
            }

            @Override
            public boolean updatePassword(int userId, String oldPass, String newPass) {
                return true;
            }
        });

        server.setPasswordEnc(new StringEncrypter("invalidKey"));

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getMessage());
        assertEquals("Error During Applying New Password!", result.getException());
    }

    @Test
    void testChangePasswordWithNullResult() throws RemoteException {
        String email = "test@example.com";
        String oldPass = "password1";
        String newPass = "newpassword1";

        server.setUserBD(new UsersBD() {
            @Override
            public User authenticateUser(String email, String password) {
                return new User(1, email, password);
            }

            @Override
            public boolean updatePassword(int userId, String oldPass, String newPass) {
                return true;
            }
        });

        server.setPasswords(null);

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getMessage());
        assertEquals("Error During Applying New Password!", result.getException());
    }

    @Test
    void testChangePasswordWithEmptyOldPassword() throws RemoteException {
        String email = "test@example.com";
        String oldPass = "";
        String newPass = "newpassword1";

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getMessage());
        assertEquals("Invalid Password!", result.getException());
    }

    @Test
    void testChangePasswordWithEmptyNewPassword() throws RemoteException {
        String email = "test@example.com";
        String oldPass = "password1";
        String newPass = "";

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getMessage());
        assertEquals("Error During Applying New Password!", result.getException());
    }

    @Test
    void testChangePasswordWithNullOldPassword() throws RemoteException {
        String email = "test@example.com";
        String oldPass = null;
        String newPass = "newpassword1";

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getMessage());
        assertEquals("Invalid Password!", result.getException());
    }

    @Test
    void testChangePasswordWithNullNewPassword() throws RemoteException {
        String email = "test@example.com";
        String oldPass = "password1";
        String newPass = null;

        ResultBean result = server.changePassword(email, oldPass, newPass);

        assertFalse(result.isSuccess());
        assertEquals(IConstant.ERROR, result.getMessage());
        assertEquals("Error During Applying New Password!", result.getException());
    }
}